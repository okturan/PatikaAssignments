package week6.jdbc;

import java.sql.*;

public class JDBCExample {

	// Database connection details
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/company";
	private static final String JDBC_USER = "root";
	private static final String JDBC_PASSWORD = "mysql";

	public static void main (String[] args) {
		// SQL query to drop the employees table if it exists
		String dropTableQuery = "DROP TABLE IF EXISTS employees";

		// SQL query to create the employees table
		String createTableQuery = """
                CREATE TABLE employees
                (
                    id       INT PRIMARY KEY AUTO_INCREMENT,
                    name     VARCHAR(50),
                    position VARCHAR(50),
                    salary   DECIMAL
                );
                """;

		// SQL query to insert mock data into the employees table
		String insertDataQuery = """
                INSERT INTO employees (name, position, salary)
                VALUES ('Indiana Jones', 'Archaeologist', 53000.00),
                       ('Lara Croft', 'Explorer', 62000.00),
                       ('Buffy Summers', 'Vampire Slayer', 65000.00),
                       ('Tony Stark', 'Engineer', 125000.00),
                       ('Han Solo', 'Pilot', 115000.00);
                """;

		// SQL query to select all data from the employees table
		String selectSQL = """
                SELECT id, name, position, salary
                FROM employees
                """;

		try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
			 Statement statement = connection.createStatement()) {

			// Drop the employees table if it exists
			statement.executeUpdate(dropTableQuery);

			// Create the employees table
			statement.executeUpdate(createTableQuery);

			// Insert mock data into the employees table
			statement.executeUpdate(insertDataQuery);

			// Execute the select query and process the result set
			try (ResultSet resultSet = statement.executeQuery(selectSQL)) {
				// Iterate through the result set and print each row
				while (resultSet.next()) {
					int id = resultSet.getInt("id");
					String name = resultSet.getString("name");
					String position = resultSet.getString("position");
					double salary = resultSet.getDouble("salary");
					System.out.println("ID: " + id + ", Name: " + name + ", Position: " + position + ", Salary: " + salary);
				}
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
