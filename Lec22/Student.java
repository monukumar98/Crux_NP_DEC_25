package Lec22;

public class Student {

	String name;
	int age;

	public void Intro_yourSelf() {
		System.out.println("My name is " + this.name + " and age is " + this.age);
	}

	public void SayHey(String name) {

		System.out.println(this.name + " Say Hey " + name);
	}

	public static void Mentor_Name() {
		System.out.println("Monu Bhaiya");
	}
	static {
		System.out.println("Student static Block 1");
	}
	static {
		System.out.println("Student static Block 2");
	}
}
