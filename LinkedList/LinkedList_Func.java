package LinkedList;


class Node{
	int data;			//Data
	Node next;			//Reference(pointer)
	Node(int val)
	{
		data=val;
		next=null;
	}
}

public class LinkedList_Func{

	Node head;		//First node is always head
	Node temp;		
	Node lastNode;	//Last node is always lastNode

	LinkedList_Func()
	{
		head=null;	//Head is null when the object creation
	}
	
	public void insertAtBegining(int val)
	{
		Node newNode = new Node(val); 
		if(head==null)
		{
			head=newNode;	//head is newNode when the head is null
			lastNode=newNode;	//newNode is lastNode when the head is null
		}
		else
		{
			newNode.next=head;		//change the Reference
			head=newNode;			//head is newNode
		}
		System.out.println("Value inserted");
	}
	
	public void insertAtEnd(int val)
	{
		Node newNode = new Node(val); 
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			lastNode.next=newNode;	//new Node is lastNode's reference
		}
		lastNode=newNode;	//Now lastNode is newNode
		System.out.println("Value inserted");
	}
	public void insertAtPosition(int pos,int val)
	{
		if(pos==0)
		{
			insertAtBegining(val); 	//If position is 0.the value is added at begin of the list.So we call it.
		}
		else
		{
			int i=0;
			Node newNode = new Node(val); 
			temp=head;		//temp is point the head.it means temp is first node.
			while(i!=pos-1)
			{
				temp=temp.next;
				i++;		
			}
			//when the i is not equal to pos-1 we find the previous node of position.
			//Because the reference of that element is newNode.
			if(temp==lastNode)
			{
				insertAtEnd(val);	//If position is next to the last node we added to the end of the list.
				return;
			}
			
			newNode.next=temp.next;	//newNode reference is point to the next node
			temp.next=newNode;		//change the previous node reference to newNode	
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
			//change the head to head reference.head reference is point to the next node.
			//so we change it head reference to head. 
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
			//we find the previous node of last node.Because previous node reference is point to the last node.
			
			temp.next=null;	
			//And then we replace the previous node reference to null.
			//Because it is point to the last node.Now the last node is delete or unlinked.
			lastNode=temp;	//Now last node is previous node.
			System.out.println("Last Element Deleted...");
		}
	}
	
	public void DeleteAtPosition(int pos)
	{
		Node curr=null;
		int i=0;
		temp=head;
		while(i!=pos)	//Find the position when the i is not equal position
		{
			curr=temp;
			temp=temp.next;
			i++;
		}
		if(temp==lastNode)
		{
			DeleteAtEnd();	//If temp is last node.
			return;
		}
		curr.next=temp.next;	//change the reference
		
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
	
	public void itContains(int val)
	{
		temp=head;
		int f=0;
		while(temp!=null)
		{
			if(temp.data==val)
			{
				f=1;
				System.out.println("Value present in list");
				break;
			}
			temp=temp.next;
		}
		if(f==0)
			System.out.println("Value not present in list");
	}
	
	public void display() 
	{
		temp=head;
		System.out.println("List Values");
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println("Values Displayed...\n");
	}
}


