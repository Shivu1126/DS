package Doubly_Linked_Lsit;

public class Main_DLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		G_Doubly_Liinked<Object> list= new G_Doubly_Liinked<>();
		
		list.insertAtBegin(1);
		list.insertAtBegin(2);
		list.insertAtBegin("shiv");
		list.display();
		list.displayRev();

		list.insertAtEnd("james");
		list.display();
		list.displayRev();
		
		list.display();
		
		list.insertAtPos(2, "virat");
		list.display();
		list.displayRev();
		
		list.DeleteAtBegin();
		list.display();
		list.displayRev();
		
		list.DeleteAtEnd();
		list.display();
		list.displayRev();
		
		list.insertAtEnd("james");
		list.insertAtBegin(18);
		list.insertAtEnd(11);
		list.display();
		list.displayRev();
		
		
		list.DeleteAtBegin();
		list.display();
		list.displayRev();
		
		list.insertAtBegin("shiv");
		list.DeleteAtPosition(3);
		list.display();
		list.displayRev();
		
		list.insertAtPos(2, "virat");
		list.insertAtEnd(11);

		list.display();
		list.displayRev();
		
		
	}

}
