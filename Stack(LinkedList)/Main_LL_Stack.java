package LinkedList_Stack_Implementation;

import Stack_Implementation.StackSize;

public class Main_LL_Stack {

	public static void main(String[] args) throws StackSize {

		GenLL_Stack<Object> stack = new GenLL_Stack<>();
		
		System.out.println(stack.isEmpty());
		stack.PUSH("Hiii....");
		System.out.println(stack.PEAK());
		stack.PUSH("Heyyy....");
		stack.PUSH(71);
		System.out.println(stack.PEAK());
		stack.POP();
		System.out.println(stack.PEAK());
		stack.PUSH(71);
		stack.PUSH(81);
		stack.PUSH('K');
		stack.PUSH("helloo..");
		System.out.println(stack.PEAK());
		System.out.println(stack.isEmpty());
		stack.PUSH("CRIC");
		System.out.println(stack.PEAK());
		stack.POP();
		System.out.println(stack.PEAK());

		stack.POP();
		stack.POP();
		stack.POP();
		stack.POP();
		stack.POP();
		stack.POP();

		System.out.println(stack.isEmpty());

		
	}

}
