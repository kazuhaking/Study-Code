import java.nio.file.AccessDeniedException;
import java.util.*;
class BasicLinkedList <E> implements ListInterface <E> 
{
	private ListNode <E> head = null;
	private int num_nodes = 0;

	public boolean isEmpty() 
    { 
        //return (num_nodes == 0); 
        if(num_nodes == 0)
            return  true;
        else  
            return  false;
    }

	public int size() 
    { 
        return num_nodes; 
    }

	public E getFirst() throws NoSuchElementException 
    {
		if (head == null) 
			throw new NoSuchElementException("can't get from an empty list");
		else return head.getElement();
	}

	public boolean contains(E item) 
    {
		for (ListNode <E> n = head; n != null; n = n.getNext())
			if (n.getElement().equals(item)) 
                return true;
		return false;
	}
	public void addFirst(E item) {
		head = new ListNode <E> (item, head);//code  of  NUS
 		//ListNode p = new ListNode (item);
		//p.setNext(head);
		//head = p;

		num_nodes++;
	}

	public E removeFirst() throws NoSuchElementException 
    {
		ListNode <E> ln;
		if (head == null) 
			throw new NoSuchElementException("can't remove from empty list");
		else { 
			ln = head;
			head = head.getNext();//the  most  important  statement
			num_nodes--;
			return ln.getElement();
		}
	}

	public void print() throws NoSuchElementException 
    {
		if (head == null)
			throw new NoSuchElementException("Nothing to print...");

		ListNode <E> ln = head;
		System.out.print("List is: " + ln.getElement());
		//for (int i=1; i < num_nodes; i++) 
		while  (ln.getNext()  != null)
        {
			ln = ln.getNext();
			System.out.print(", " + ln.getElement());
		}
		System.out.println(".");
	}
	public void addAfter(ListNode <E> current, E item)
	{
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
	public void addLast(E item)
	{
		if  (head == null)
		{
			addFirst(item);
		}
		else
		{
			ListNode<E> q = head;
			while (q.getNext() != null)
				q = q.getNext();//q la phan tu cuoi cung
			
			ListNode<E> p = new ListNode<E>(item);
			q.setNext(p);	
		}
		num_nodes++;
	}
	public void addAfter(E current, E item)
	{
		ListNode<E> p = head; //int i = 0;
		//find item current in the list?
		while (p != null)//i < n 
		{
			if(p.getElement().equals(current))
				break;
			p = p.getNext();//++i;
		}
		if (p != null)//found!!!
		{
			ListNode<E> y = new ListNode<E>(item);
			y.setNext(p.getNext());
			p.setNext(y);
		}
		else { // insert item at front
			head = new ListNode <E> (item, head);
		}
		num_nodes++;
	}
	public E removeAfter(ListNode <E> current) throws NoSuchElementException
	{
		E temp;
		if (current != null) {
			ListNode <E> nextPtr = current.getNext();
			if (nextPtr != null) {
				temp = nextPtr.getElement();
				current.setNext(nextPtr.getNext());
				num_nodes--;
				return temp;
			} else throw new NoSuchElementException("No next node to remove");
		} else { // if current is null, assume we want to remove head
			if (head != null) {
				temp = head.getElement();
				head = head.getNext(); 
				num_nodes--;
				return temp;
			} else throw new NoSuchElementException("No next node to remove");
		}
	}
	public ListNode<E> getHead()
	{
		return  head;
	}
	public E remove(E x) throws NoSuchElementException
	{
		ListNode<E> q, p;
		q = head;
		p = head;
		while (p.getNext() != null)
		{
			if(p.getElement().equals(x))
				break;
			q = p;//store precede of p
			p = p.getNext();
		}
		if(p != null)
		{
			q.setNext(p.getNext());
			return x;
		}
		return null;
	}
}    