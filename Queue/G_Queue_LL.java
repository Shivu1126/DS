package Queue_Implementaion;

public class G_Queue_LL<Gen> {

	class Node
	{
		Gen data;
		Node next;
		Node(Gen val)
		{
			data=val;
			next=null;
		}
	}
	Node head;
	Node temp;
	Node lastNode;
		
	public G_Queue_LL()
	{
		head=null;
	}
	
	public void enQueue(Gen val)
	{
		Node newNode=new Node(val);
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			lastNode.next=newNode;
		}
		lastNode=newNode;
		System.out.println("Value added..");
	}
	public void deQueue()
	{
		if(head==null)
		{
			System.out.println("Please add the value..");
		}
		else if(head.next==null)
		{
			System.out.println(head.data+"Value deQueued...");
			head=null;
		}
		else
		{
			temp=head;
			while(temp.next!=lastNode)
			{
				temp=temp.next;
			}
			System.out.println(lastNode.data+"value DeQueued...");
			temp.next=null;
			lastNode=temp;
		}
	}
	

}
