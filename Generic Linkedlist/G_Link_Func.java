package Generics_LinkedList;


public class G_Link_Func<Gen> {
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

	G_Link_Func()
	{
		head=null;
	}
	
	public void insertAtBegining(Gen val)
	{
		Node newNode = new Node(val); 
		if(head==null)
		{
			head=newNode;
			lastNode=newNode;
		}
		else
		{
			newNode.next=head;
			head=newNode;
		}
		System.out.println("Value inserted");
	}
	
	public void insertAtEnd(Gen val)
	{
		Node newNode = new Node(val); 
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			lastNode.next=newNode;
		}
		lastNode=newNode;
		System.out.println("Value inserted");
	}
	public void insertAtPosition(int pos,Gen val)
	{
		if(pos==0)
		{
			insertAtBegining(val);
		}
		else
		{
			int i=0;
			Node newNode = new Node(val); 
			temp=head;
			while(i!=pos-1)
			{
				temp=temp.next;
				i++;
			}
			if(temp==lastNode)
			{
				insertAtEnd(val);
				return;
			}
			
			newNode.next=temp.next;
			temp.next=newNode;			
			System.out.println("Value inserted");

		}
	}
	
	public void DeleteAtBegining()
	{
		if(head==null)
		{
			System.out.println("Please insert values...");
		}
		else
		{
			head=head.next;
			System.out.println("First Element Deleted");
		}
	}
	
	public void DeleteAtEnd()
	{
		if(head==null)
		{
			System.out.println("Please insert values...");
		}
		else if(head.next==null)
		{
			head=null;
			System.out.println("Deleted");
		}
		else
		{
			temp=head;
			while(temp.next!=lastNode)
			{
				temp=temp.next;
			}
			temp.next=null;
			lastNode=temp;
			System.out.println("Last Element Deleted...");
		}
	}
	
	public void DeleteAtPosition(int pos)
	{
		Node curr=null;
		int i=0;
		temp=head;
		while(i!=pos)
		{
			curr=temp;
			temp=temp.next;
			i++;
		}
		if(temp==lastNode)
		{
			DeleteAtEnd();
			return;
		}
		curr.next=temp.next;
		
	}
	public void getValue(int pos)
	{
		int i=0;
		temp=head;
		while(i!=pos)
		{
			temp=temp.next;
			i++;
		}
		System.out.println("Index = "+i+" Value = "+temp.data);
	}
	
	public void itContains(Gen val)
	{
		int f=0;
		temp=head;
		while(temp!=null)
		{
			if(temp.data==val)
			{
				f=1;
				System.out.println("Value is present in list");
				break;
			}
			temp=temp.next;
		}
		if(f==0)
			System.out.println("Value is not present");
	}
	
	public void display() 
	{
		temp=head;
		System.out.println("List Values");
		System.out.print("[");
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.print("]");
		System.out.println("\nValues Displayed...");
	}

	
	
}
