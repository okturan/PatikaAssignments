package week2.SalaryCalculator;

public class Employee {
	// Çalışanın nitelikleri için sınıf değişkenleri
	String name; // Çalışanın adı
	int salary; // Çalışanın temel maaşı
	int hireYear; // Çalışanın işe alındığı yıl
	int workHours; // Bir hafta içinde çalışılan saat sayısı

	// Bir Çalışan nesnesini ad, maaş, işe alma yılı ve çalışma saatleri ile başlatmak için kurucu
	Employee(String name, int salary, int hireYear, int workHours) {
		this.name = name;
		this.salary = salary;
		this.hireYear = hireYear;
		this.workHours = workHours;
	}

	// Maaşa göre vergi hesaplaması yapan metod
	public double tax() {
		if (this.salary > 1000) { // Eğer maaş 1000'den fazlaysa, %3 vergi hesapla
			return (this.salary * 0.03);
		}
		return 0; // Maaş 1000 veya daha az ise vergi yok
	}

	// Fazla çalışılan saatlere göre bonus hesaplayan metod
	public int bonus() {
		if (this.workHours > 40) { // 40 saatten fazla çalışıldıysa, fazladan saatler için bonus ver
			return (this.workHours - 40) * 30; // Bonus hesaplama: Fazla her saat için 30 birim
		}
		return 0; // 40 saat veya daha az çalışıldıysa bonus yok
	}

	// Çalışılan yıl sayısına göre maaş zammı hesaplayan metod
	public double raiseSalary() {
		int currentYear = 2021; // Hesaplama için geçerli yıl
		if (currentYear - hireYear < 10) { // 10 yıldan az bir süredir hizmet veriliyorsa
			return this.salary * 0.05; // %5 zam
		} else if (currentYear - hireYear >= 10 && currentYear - hireYear < 20) { // 10 ile 19 yıl arası hizmet
			return this.salary * 0.10; // %10 zam
		} else { // 20 yıl veya daha fazla hizmet
			return this.salary * 0.15; // %15 zam
		}
	}

	// Çalışan hakkında bilgi göstermek için toString metodunu ezmek
	public String toString() {
		return "Name: " + name +
			   "\nSalary: " + salary +
			   "\nWork hours: " + workHours +
			   "\nYear of hire: " + hireYear;
	}
}
