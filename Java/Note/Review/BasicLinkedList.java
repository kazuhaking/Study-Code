import java.util.*;
class BasicLinkedList <E> implements ListInterface <E> {
	private ListNode <E> head = null;
	private int num_nodes = 0;//not important

	public boolean isEmpty() { return (num_nodes == 0); }

	public int size() { return num_nodes; }

	public E getFirst() throws NoSuchElementException {
		if (head == null) 
			throw new NoSuchElementException("can't get from an empty list");
		else return head.getElement();
	}

	public boolean contains(E item) {
		for (ListNode <E> n = head; n != null; n = n.getNext())
			if (n.getElement().equals(item)) return true;
		return false;
	}
	public void addFirst(E item) {
		head = new ListNode <E> (item, head);
 		//ListNode p = new ListNode (item);
		//p.setNext(head);
		//head = p;

		num_nodes++;
	}

	public E removeFirst() throws NoSuchElementException {
		ListNode <E> ln;
		if (head == null) 
			throw new NoSuchElementException("can't remove from empty list");
		else { 
			ln = head;
			head = head.getNext();
			num_nodes--;
			return ln.getElement();
		}
	}
	public void print() throws NoSuchElementException {
		if (head == null)
			throw new NoSuchElementException("Nothing to print...");

		ListNode <E> ln = head;
		System.out.print("List is: \n" + ln.getElement());
		
        for (int i=1; i < num_nodes; i++) {
			ln = ln.getNext();
			System.out.print("\n" + ln.getElement());
		}
		System.out.println(".");
        //whlile  ln!= nulll
	}
	public void addAfter(ListNode <E> current, E item) {
		if (current != null) { 
	//	current.setNext(new ListNode <E>(item,current.getNext()));
			ListNode<E> p = new ListNode<E>(item);
			p.setNext(current.getNext());
			current.setNext(p);
	
		} else { // insert item at front
			head = new ListNode <E> (item, head);
		}
		num_nodes++;
	}
	public void addAfter(E x, E y) 
	{
		//find the first postion of x
		ListNode<E> q = head;//i = 0;
		while (q!=null)//i < n
		{
			if(q.getElement().equals (x))
				break;
			q = q.getNext();//i++
		}
		if(q!=null) //found
		{
			addAfter(q, y);
		}
	}
	public void addLast(E x)
	{
		//find last node
		if (head == null)
		{
			addFirst(x);
		}
		else
		{
			ListNode<E> p = head;
			while (p.getNext() != null)
			{
				p = p.getNext();
			}
			addAfter(p, x);
			
		}

	}
	// public void sortList()
    // {
  
    //     // Node current will point to head
    //     ListNode current = head, index = null;
  
    //     int temp;
  
    //     if (head == null) {
    //         return;
    //     }
    //     else {
    //         while (current != null) {
    //             // Node index will point to node next to
    //             // current
    //             index = current.getNext();
  
    //             while (index != null) {
    //                 // If current node's data is greater
    //                 // than index's node data, swap the data
    //                 // between them
    //                 if (current.element) > index.element) {
    //                     temp = current.element;
    //                     current.element = index.element;
    //                     index.element = temp;
    //                 }
  
    //                 index = index.getNext();
    //             }
    //             current = current.getNext();
    //         }
    //     }
    // }
  
}