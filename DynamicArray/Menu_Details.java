package ArrayList_Implementation;
import java.util.*;
public class Menu_Details {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Array_func list=new Array_func();
		
		int value,position;
		
		while(true)
		{
			System.out.println("______List of menu______");
			System.out.println("1.Insert at end");
			System.out.println("2.Delete at end");
			System.out.println("3.Display array");
			System.out.println("4.Insert at specified position ");
			System.out.println("5.Delete from specified position ");
			System.out.println("6.It contains ");
			System.out.println("7.Get value");
			System.out.println("8.Update value");
			System.out.println("9.Exit");
			System.out.println("---------------------------------");
			System.out.println("Enter your choice...");
			int choice=s.nextInt();
		
			switch(choice)
			{
				case 1:
					System.out.println("Enter value ");
					value=s.nextInt();
					list.insertEnd(value);
					break;
				case 2:
					list.deleteAtEnd();
					break;
				case 3:
					list.display();
					break;
				case 4:
					System.out.println("Enter Position");
					position=s.nextInt();
					if(position<0)
					{
						System.out.println("Invalid position");
						break;
					}
					System.out.println("Enter value ");
					value=s.nextInt();
					list.insertAtPosition(position,value);
					break;
				case 5:
					System.out.println("Enter Position");
					position=s.nextInt();
					if(position<0)
					{
						System.out.println("Invalid position");
						break;
					}
					list.deleteAtPosition(position);
					break;
				case 6:
					System.out.println("Enter value");
					value=s.nextInt();
					boolean b = list.contains(value);	
					if(b)
						System.out.println("Value is present");
					else
						System.out.println("Value is not present");
					break;
				case 7:
					System.out.println("Enter index");
					int i=s.nextInt();
					list.getValue(i);
					break;
				case 8:
					System.out.println("Enter position");
					position=s.nextInt();
					System.out.println("Enter new value");
					value=s.nextInt();
					list.update(position, value);
					break;
				case 9:
					System.out.println("......Thank you......");
					System.exit(0);
				default:
					System.out.println("Enter valid input");
					
			}
			
		}
		
		
	}

}
