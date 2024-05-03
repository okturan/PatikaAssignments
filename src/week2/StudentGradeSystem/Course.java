package week2.StudentGradeSystem;

public class Course {
	Teacher courseTeacher;
	String name;
	String code;
	String prefix;
	int examScore;
	int oralExamScore;
	double oralExamWeight;

	public Course(String name, String code, String prefix, double oralExamWeight) {
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		this.examScore = 0;
		this.oralExamScore = 0;
		this.oralExamWeight = oralExamWeight;
	}

	public void addTeacher(Teacher t) {
		if (this.prefix.equals(t.branch)) {
			this.courseTeacher = t;
			System.out.println("İşlem başarılı");
		} else {
			System.out.println(t.name + " Akademisyeni bu dersi veremez.");
		}
	}

	public void printTeacher() {
		if (courseTeacher != null) {
			System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
		} else {
			System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
		}
	}
}
