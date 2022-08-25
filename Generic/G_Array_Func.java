package Generics_Array;

import java.util.*;

class G_Array_Func<Gen> extends Generics implements Iterable<Gen>{

	private static final int initialCapacity=5;
	private int size;
	private Gen arr[];
	private int cap;
	@SuppressWarnings("unchecked")
	G_Array_Func()
	{
		size = 0;
		arr = (Gen[]) new Object[initialCapacity];
		cap = initialCapacity;
	}
		
	public void insertEnd(Gen value)
	{		
		if(size==cap)
			expandArray();
		arr[size]=value;
		size++;
		System.out.println("Value added at End ");

	}
	
	private void expandArray()
	{
		cap*=2;
		arr = Arrays.copyOf(arr, cap);
	}
	
	public void deleteAtEnd()
	{
		if(size==0)
		{
			System.out.println("Array is empty..pls insert value ");
			return;
		}
		size--;
		if(cap>initialCapacity && cap>3*size)
			shringArray();
		System.out.println("Delete successfully");
	}
	
	public void display()
	{
		if(size<=0)
		{
			System.out.println("Array is empty");
			return;
		}
		System.out.println();
		System.out.println("Array Values");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Values displayed...");

	}
	public void insertAtPosition(int position,Gen value)
	{
		if(size-1<position)
		{
			System.out.println("Pls enter below "+size+".");
			return;
		}
		if(size==cap)
			expandArray();
		for(int i=size-1;i>=position;i--)
			arr[i+1]=arr[i];
		arr[position]=value;
		size++;
		System.out.println("Value added at specified position ");

	}
	public void deleteAtPosition(int position) 
	{		
		if(size==0)
		{
			System.out.println("Array is empty...pls insert value");
			return;
		}
		if(size-1<position)
		{
			System.out.println("Pls enter below "+size+".");
			return;
		}
		
		for(int i=position+1;i<size;i++)
			arr[i-1]=arr[i];
		size--;
		
		if(cap>initialCapacity && cap>5*size)
			shringArray();
		System.out.println("Delete successfully...");
		
	}
	private void shringArray() {
				cap/=2;
				arr = Arrays.copyOf(arr, cap);
	}
	public boolean contains(Gen value)
	{
		for(int i=0;i<size;i++)
		{
			if(arr[i]==value)
				return true;
		}
		return false;
	}
	
	public  void getValue(int index)
	{
		if(index>=size)
		{
			System.out.println("This index is not there...pls enter correct index(below "+size+".)") ;
			return;
		}
		System.out.println("Index = "+index+" Value = "+arr[index] );		
	}
	
	public void update(int position,Gen value)
	{
		if(position>=size)
		{
			System.out.println("This position is not there...pls enter correct position(below "+size+".)") ;
			return;
		}	
		arr[position]=value;
		System.out.println("Update sucessfully");
	}
	
	//Iterator purpose is using 'for-each loop' in Generic
	@Override //iterator function
	public Iterator<Gen> iterator()
	{
		return new Iterator<Gen>() {
			int i=0;
			
			public Gen next()
			{
				return arr[i++];
			}
			public boolean hasNext() {
				return i < size ;
			}
		};
	}
	
	
}
