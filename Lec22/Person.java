package Lec22;

public class Person {

	private String name = "Kaju";
	private int age = 22;

//	public Person() {
//		// TODO Auto-generated constructor stub
//	}
//	public Person(String name) {
//		// TODO Auto-generated constructor stub
//	}

	public Person(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		try {
			if (age < 0 || age > 90) {

				throw new Exception("Bklol Age sahi kro ");
			}
			// this.age = age;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			age = this.age;
		} finally {
			System.out.println("I am in finally blocks");
			this.age = age;
		}
	}
//	public void setAge(int age) throws Exception {
//		if (age < 0 || age > 90) {
//			
//			throw new Exception("Bklol Age sahi kro ");
//		}
//		this.age = age;
//	}

//	public int getAge() {
//		return this.age;
//	}
//	public void setAge(int age) {
//		if(age<0 || age>90) {
//			return;
//		}
//		 this.age=age;
//	}
}
