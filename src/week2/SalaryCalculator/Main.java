package week2.SalaryCalculator;

import static java.lang.System.*;

public class Main {
	public static void main ( String[] args ) {
		Employee e1 = new Employee ( "Kemal", 2000, 1985, 45 );

		out.println (e1.toString ());

		out.println ( "Tax = " + e1.tax () );
		out.println ( "Bonus = " + e1.bonus () );
		out.println ( "Salary raise = " + (e1.raiseSalary ()) );
		out.println ( "Salary after tax and bonus added = " + (e1.salary + e1.bonus () - e1.tax ()) );
		out.println ( "Salary after raise = " + (e1.salary + e1.bonus () - e1.tax () + e1.raiseSalary ()) );

	}
}
