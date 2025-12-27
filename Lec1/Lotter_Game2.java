package Lec1;

public class Lotter_Game2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 768;
		if (n >= 50 && n <= 129) {
			System.out.println("Won Bike");
			if(n<=112) {
				System.out.println("Hero Bike");
			}
			else {
				System.out.println("KTM");
			}
			
		} 
		else if (n >= 450 && n <= 569) {
			System.out.println("Won Mac");
			if(n<=491) {
				System.out.println("Mac M1");
			}
			else {
				System.out.println("Mac M3");
			}
		} 
		else if (n >= 259 && n <= 380) {
			System.out.println("Won Cycle");
			if(n<=311) {
				System.out.println("ATLS");
			}
			else {
				System.out.println("Hero");
			}
		} 
		else if (n >= 650 && n <= 785) {
			System.out.println("Won Kurkure");
			if(n<=701) {
				System.out.println("Red Kurkure");
			}
			else {
				System.out.println("Green Kurkure");
			}
		} 
		else {
			System.out.println("Happy BirthDay!");
		}

	}
}
