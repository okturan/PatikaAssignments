package week2.SalaryCalculator;

public class Main {
	public static void main (String[] args) {
		// Çalışan nesnesi oluşturuluyor. İsim, maaş, işe alma yılı ve çalışma saatleri parametre olarak veriliyor
		Employee e1 = new Employee("Kemal", 2000, 1985, 45);

		// Çalışanın bilgilerini yazdır
		System.out.println(e1.toString());

		// Vergiyi hesapla ve yazdır
		System.out.println("Tax = " + e1.tax());
		// Bonusu hesapla ve yazdır
		System.out.println("Bonus = " + e1.bonus());
		// Maaş zammını hesapla ve yazdır
		System.out.println("Salary raise = " + e1.raiseSalary());
		// Vergi ve bonus eklenmiş maaşı hesapla ve yazdır
		System.out.println("Salary after tax and bonus added = " + (e1.salary + e1.bonus() - e1.tax()));
		// Zam sonrası maaşı hesapla ve yazdır. Bu maaş, vergi çıkarıldıktan ve bonus eklenip zam uygulandıktan sonra elde edilen miktardır.
		System.out.println("Salary after raise = " + (e1.salary + e1.bonus() - e1.tax() + e1.raiseSalary()));
	}
}
