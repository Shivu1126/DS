package Generics_Array;

import java.util.Iterator;

public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		G_Array_Func<Object> list=new G_Array_Func<>();
		Object a=2;
		Object b="hello";
		Object c='s';
		Object d=true;
		Object e=6;
		Object f="hello";
		Object g='v';
		Object h=false;
		Object con="shiv";
		list.insertEnd(a);
		list.insertEnd(b);
		list.insertEnd(c);
		list.insertEnd(d);
		list.insertEnd(e);
		list.insertEnd(f);
		list.insertEnd(g);
		list.insertEnd(h);
		
		list.display();
		
		list.deleteAtEnd();
		
		list.display();
		
		list.insertAtPosition(4, "shiv");
		
		list.display();
		
		list.deleteAtPosition(5);
		
		list.display();
		
		System.out.println(list.contains(con));
		
		list.getValue(4);
		
		list.update(5, "james");
				
		list.display();
		
		
		System.out.println("Iterator");
		
		Iterator<Object> it = list.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next());
		}
		System.out.println();
		for(Object i:list)
		{
			System.out.println(i);
		}
	}

}
