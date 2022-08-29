package Stack_Implementation;

public class Main_Stack {

	public static void main(String[] args) throws StackSize {
		// TODO Auto-generated method stub
			GenericArrayStack<Object> stack= new GenericArrayStack<>();
			
			System.out.println(stack.isEmpty());
			stack.PUSH(8);
			System.out.println(stack.PEAK());
			stack.PUSH("shiv");
			System.out.println(stack.PEAK());
			stack.POP();
			System.out.println(stack.PEAK());
			stack.PUSH("hey...");
			stack.PUSH('v');
			stack.PUSH(19.3223);
			stack.PUSH(257097547);
			System.out.println(stack.PEAK());
			stack.POP();
			stack.POP();
			stack.POP();
			System.out.println(stack.PEAK());
			System.out.println(stack.isEmpty());
			stack.POP();
			stack.POP();
			System.out.println(stack.isEmpty());
	}

}
