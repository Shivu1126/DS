package Doubly_Linked_Lsit;



public class G_Doubly_Liinked<Gen>{

	class Node{
		Gen data;
		Node next;
		Node prev;
		Node(Gen val)
		{
			data=val;
			next=null;
			prev=null;
		}
	}
	Node head;
	Node temp;
	Node lastNode;
	
	G_Doubly_Liinked(){
		head=null;
		lastNode=null;
	}
	
	public void insertAtBegin(Gen val)
	{
		Node newNode=new Node(val);
		if(head==null)
		{
			head=newNode;
			lastNode=newNode;
		}
		else
		{
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
		}
		System.out.println("Value Inserted");
	}
	
	public void insertAtEnd(Gen val)
	{
		Node newNode=new Node(val);
		
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			lastNode.next=newNode;
			newNode.prev=lastNode;
		}
		lastNode=newNode;
		System.out.println("Value inserted");
		
	}
	
	public void insertAtPos(int pos,Gen val)
	{
		
		if(pos==0)
			insertAtBegin(val);
		else 
		{
			int i=0;
			Node newNode = new Node(val); 
			temp=head;
			while(i!=pos-1)
			{
				temp=temp.next;
				i++;
				if(temp==null)
				{
					System.out.println("Invalid position");
					return;
				}
			}
			if(temp==lastNode)
			{
				insertAtEnd(val);
				return;
			}
			
			newNode.next=temp.next;	//newNode's next is point to the temp next 
			newNode.prev=temp;		//newNode's previous is point to the temp
			
			temp.next.prev=newNode;		//temp next's previous is point to the newNode
			temp.next=newNode;			//temp's next is point to the newNode
			
			
		}
	}
	
	public void DeleteAtBegin()
	{
		if(head==null)
		{
			System.out.println("Please insert values...");
		}
		else
		{
			head.next.prev=null;
			head=head.next;
			System.out.println("Value deleted");
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
			System.out.println("Deleted...list is empty");
		}
		else
		{
			lastNode.prev.next=null;
			lastNode=lastNode.prev;
			System.out.println("Last Element Deleted...");
		}	
	}
	
	public void DeleteAtPosition(int pos)
	{
		if(pos==0)
		{
			DeleteAtBegin();
			return;
		}
		Node curr=null;
		int i=0;
		temp=head;
		while(i!=pos)
		{
			curr=temp;
			temp=temp.next;
			i++;
			if(temp==null)
			{
				System.out.println("Invalid position");
				return;
			}
		}
		if(temp==lastNode)
		{
			DeleteAtEnd();
			
		}
		else
		{
			curr.next=temp.next;	
			temp.next.prev=curr;	
		}
		
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
	public void displayRev() 
	{
		temp=lastNode;
		System.out.println("List Values (Reverse)");
		System.out.print("[");
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.prev;
		}
		System.out.print("]");
		System.out.println("\nValues Displayed...");
	}
}
