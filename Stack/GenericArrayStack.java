package Stack_Implementation;

public class GenericArrayStack<Gen> 
{
	final int max_Size=5;
	Gen arr[];
	int top;
	@SuppressWarnings("unchecked")
	public GenericArrayStack() 
	{
		top=-1;
		arr=(Gen[])new Object[max_Size];
	}
	
	void PUSH(Gen val) throws StackSize
	{
		if(top==max_Size-1)
		{
			throw new StackSize("Stack is full");
		}
		else
		{
			top++;
			arr[top]=val;
			System.out.println("Value Pushed");
		}
	}
	
	void POP() throws StackSize
	{
		if(top==-1)
			throw new StackSize("Stack is Empty");
		else
		{
			System.out.println(arr[top]+" is popped");
			top--;
		}
	}
	Gen PEAK()
	{
		if(top==-1) {
			@SuppressWarnings("unchecked")
			Gen r=(Gen) "Stack is empty";
			return r;		
		}
		else {
			System.out.println("Peak value is...");
			return arr[top];				
		}		
	}
	String isEmpty()
	{
		return top==-1?"Stack is Empty " : "Stack is Not Empty";
	}
}
