package week2.SalaryCalculator;

public class Employee {
	String name;
	int salary, hireYear, workHours;

	Employee ( String name, int salary, int hireYear, int workHours ) {
		this.name = name;
		this.salary = salary;
		this.hireYear = hireYear;
		this.workHours = workHours;
	}

	public double tax () {
		if ( this.salary > 1000 ) {
			return (this.salary * 0.03);
		}
		return 0;
	}

	public int bonus () {
		if ( this.workHours > 40 ) {
			return (this.workHours - 40) * 30;
		}
		return 0;
	}

	public double raiseSalary () {
		int currentYear = 2021;
		if ( currentYear - hireYear < 10 ) {
			return this.salary * 0.05;
		} else if ( currentYear - hireYear >= 10 && currentYear - hireYear < 20 ) {
			return this.salary * 0.10;
		} else {
			return this.salary * 0.15;
		}
	}

	public String toString () {
		return "Name: " + name +
			   "\nSalary: " + salary +
			   "\nWork hours: " + workHours +
			   "\nYear of hire: " + hireYear;
	}

}
