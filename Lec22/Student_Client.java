package Lec22;



public class Student_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");
		Student s = new Student();
		s.age = 19;
		s.name = "Kaju";
		Student s1 = new Student();
		s1.age = 29;
		s1.name = "Raju";
		s.Intro_yourSelf();
		s1.Intro_yourSelf();
		s.SayHey("Rajesh");
		Student.Mentor_Name();
	}

	static {
		Student s2 = new  Student();
		System.out.println("Student_Client static Block 1");
	}

}
