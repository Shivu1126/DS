package Queue_Implementaion;

public class main_Queue {
	public static void main(String args[])
	{
		G_Queue_LL<Object> queue=new G_Queue_LL<>();
		queue.deQueue();
		queue.enQueue("shiv..");
		queue.deQueue();
		queue.enQueue("shiv..");
		queue.enQueue(19);
		queue.enQueue('g');
		queue.enQueue("hey..");
		queue.deQueue();

		queue.deQueue();
		queue.deQueue();

	}
}
