package Generics_LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		G_Link_Func<Object> list = new G_Link_Func<>();
		
		list.insertAtEnd("shiv");
		list.insertAtEnd("james");
		list.insertAtBegining(18);
		list.insertAtEnd(07);
		list.display();
		
		list.DeleteAtBegining();
		list.display();
		list.DeleteAtEnd();
		list.display();


		list.insertAtEnd('V');
		list.insertAtEnd('K');
		list.insertAtEnd(18);
		list.insertAtEnd(17.9912);
		list.insertAtEnd("Finish");
		list.insertAtEnd("----");
		
		list.display();
		
		Object k=list.lastNode.data;
		System.out.println(k);
		
		list.DeleteAtPosition(5);
		list.display();
		
		list.insertAtPosition(0, "Linked_List");
		list.display();

	}

}
