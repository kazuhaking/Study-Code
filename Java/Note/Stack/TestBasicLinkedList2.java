import java.util.*;

public class TestBasicLinkedList2 {
	public static void main(String [] args) 
		                   throws NoSuchElementException {
		BasicLinkedList <Integer> list = new BasicLinkedList <Integer>();
		Scanner  sc  = new  Scanner(System.in);
		int  n  = sc.nextInt ();
		int  a, b = 0;
		for  (int  i  = 0; i< n; ++i)
		{
			a  = sc.nextInt();
			if(list.getHead() == null)
			{
				list.addFirst(a);
				//b = a;
			}
			else
			{
				list.addLast(a);
				//b = a;
			}
		}
		
		list.print();
		list.addLast(100);
		list.print();				
		/*
		list.addFirst(8);
		list.print();
		ListNode<Integer> p = list.getHead();
		list.addAfter(p, 10);
		list.print();
		*/			
		
	}
}
