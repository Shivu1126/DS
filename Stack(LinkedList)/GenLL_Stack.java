package LinkedList_Stack_Implementation;

import Stack_Implementation.StackSize;

public class GenLL_Stack <Gen>{
	
	class Node{
		Gen data;
		Node next;
		Node(Gen val)
		{
			data=val;
			next=null;
		}		
	}
	
	Node head;
	Node lastNode;
	Node temp;
	public GenLL_Stack()
	{
		head=null;
	}
	
	void PUSH(Gen val)
	{
		Node newNode = new Node(val);
		
		if(head==null)
			head=newNode;
		else
			lastNode.next=newNode;
		
		lastNode=newNode;
		System.out.println("Value Pushed...");
	}
	
	void POP() throws StackSize
	{
		if(head==null)
			throw new StackSize("Stack is Empty");
		else if(head.next==null)
		{
			System.out.println(lastNode.data+" is popped...");					
			head=null;
		}
		else
		{
			temp=head;
			while(temp.next!=lastNode)
			{
				temp=temp.next;
			}
			temp.next=null;
			System.out.println(lastNode.data+" is popped...");					
			lastNode=temp;
			System.out.println();
		}
	}
	Gen PEAK() throws StackSize
	{
		if(head==null)
			throw new StackSize("Stack is Empty");
		else
		{
			System.out.println("Peak value is...");
			return lastNode.data;
		}
	}
	
	String isEmpty()
	{
		return head==null?"Stack is Underflow...":"Stack is Not Empty...";
	}
}
