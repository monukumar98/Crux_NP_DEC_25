package Lec23;

public class QueueClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		q.Enqueue(50);
		System.out.println(q.Dequeue());
		System.out.println(q.Dequeue());
		q.Enqueue(60);
		q.Display();

	}

}
