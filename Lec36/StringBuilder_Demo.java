package Lec36;

public class StringBuilder_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		sb.append('a');
		sb.append(1);
		sb.append(true);
		sb.append("coding");
		sb.append("heya");
		System.out.println(sb);
		sb.append("nba");
		System.out.println(sb.length());
		System.out.println(sb.capacity());// 2* old_capacity +2
		System.out.println(sb.substring(1, 4));
		System.out.println(sb.charAt(2));
		StringBuilder sb1 = new StringBuilder();
		sb1.append("codingblocks");
		System.out.println(sb.equals(sb1));
		System.out.println(sb.compareTo(sb1));
		String s=sb.toString();
		

	}

}
