package LinkedList;

public class Main_Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList_Func list = new LinkedList_Func();
		list.insertAtBegining(4);
		list.display();
		System.out.println();
		list.DeleteAtEnd();
		list.display();
		list.insertAtBegining(10);
		list.insertAtEnd(11);
		list.insertAtBegining(99);
		list.insertAtEnd(12);
		list.display();
		System.out.println();
		list.DeleteAtBegining();
		
		list.display();

		System.out.println();
		list.DeleteAtEnd();
		list.display();
		list.insertAtEnd(12);
		list.insertAtEnd(14);
		list.display();
		list.insertAtPosition(0, 13);
		list.display();

		list.insertAtEnd(4);
		list.display();
		list.DeleteAtPosition(2);
		list.display();

		list.DeleteAtEnd();
		list.display();
		list.insertAtPosition(4, 20);
		list.display();
		list.DeleteAtEnd();
		list.display();
		list.DeleteAtEnd();
		list.display();
		list.getValue(2);
		list.itContains(1);
	}

}
