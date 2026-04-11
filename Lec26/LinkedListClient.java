package Lec26;

public class LinkedListClient {
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		ll.addfirst(10);
		ll.addfirst(20);
		ll.addfirst(30);
		ll.addfirst(40);
		ll.addlast(9);
		ll.addindex(-7, 2);
		ll.display();
		System.out.println(ll.getfirst());
		System.out.println(ll.getlast());
		System.out.println(ll.getindex(2));
	}

}
