package week2.StudentGradeSystem;

public class Student {
	String name,stuNo;
	int classes;
	Course mat;
	Course fizik;
	Course kimya;
	double average;
	boolean isPass;


	Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
		this.name = name;
		this.classes = classes;
		this.stuNo = stuNo;
		this.mat = mat;
		this.fizik = fizik;
		this.kimya = kimya;
		calcAverage ();
		this.isPass = false;
	}


	public void addBulkExamScore ( int mat, int fizik, int kimya) {

		if (mat >= 0 && mat <= 100) {
			this.mat.examScore = mat;
		}

		if (fizik >= 0 && fizik <= 100) {
			this.fizik.examScore = fizik;
		}

		if (kimya >= 0 && kimya <= 100) {
			this.kimya.examScore = kimya;
		}

	}

	public void addBulkOralExamScore ( int matOral, int fizikOral, int kimyaOral ) {

		if ( matOral >= 0 && matOral <= 100) {
			this.mat.oralExamScore = matOral;
		}

		if ( fizikOral >= 0 && fizikOral <= 100) {
			this.fizik.oralExamScore = fizikOral;
		}

		if ( kimyaOral >= 0 && kimyaOral <= 100) {
			this.kimya.oralExamScore = kimyaOral;
		}

	}

	public void isPass() {
		if ( this.mat.examScore == 0 || this.fizik.examScore == 0 || this.kimya.examScore == 0) {
			System.out.println("Notlar tam olarak girilmemiş");
		} else {
			this.isPass = isCheckPass();
			printNote();
			System.out.println("Ortalama : " + this.average );
			if (this.isPass) {
				System.out.println("Sınıfı Geçti. ");
			} else {
				System.out.println("Sınıfta Kaldı.");
			}
		}
	}

	public void calcAverage () {
		this.average = (int) (((this.fizik.examScore * (1 - this.fizik.oralExamWeight) + (this.fizik.oralExamScore * this.fizik.oralExamWeight)) +
					   (this.mat.examScore * (1 - this.mat.oralExamWeight) + (this.mat.oralExamScore * this.mat.oralExamWeight)) +
					   (this.kimya.examScore * (1 - this.kimya.oralExamWeight) + (this.kimya.oralExamScore * this.kimya.oralExamWeight))) / 3);
	}

	public boolean isCheckPass() {
		calcAverage ();
		return this.average > 55;
	}

	public void printNote(){
		System.out.println("=========================");
		System.out.println("Öğrenci : " + this.name);
		System.out.println("Matematik Notu : " + this.mat.examScore );
		System.out.println("Matematik Sözlü Notu : " + this.mat.oralExamScore );
		System.out.println("Fizik Notu : " + this.fizik.examScore );
		System.out.println("Fizik Sözlü Notu : " + this.fizik.oralExamScore);
		System.out.println("Kimya Notu : " + this.kimya.examScore );
		System.out.println("Kimya Sözlü Notu : " + this.kimya.oralExamScore );
	}

}
