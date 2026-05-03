package Lec32;

public class Abstract_Demo_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Abstract_Demo_P ab = new Abstract_Demo_P() {
//		@Override
//		public boolean pay(int x) {
//			return true;
//		}
//			
//		};
//		ab.pay(100);
//		Abstract_Demo_P ab = new Abstract_Demo_P();
		Abstract_Demo_C ab = new Abstract_Demo_C();
		ab.pay(100);
	}

}
