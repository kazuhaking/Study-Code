import java.util.*;
public class TestStack {
	public static void main (String[] args) {

		// You can use any of the following 4 implementations of Stack
		StackLL <ListNode> stack = new StackLL <ListNode>(); // LinkedList composition 
		//StackLLE <String> stack = new StackLLE <String>(); // LinkedList inheritance 
		//Stack <String> stack = new Stack <String>();  // Java API

		System.out.println("stack is empty? " + stack.empty());
		
		stack.push(new ListNode (new Fraction(11, 3)));
		stack.push(new ListNode (new Fraction(10, 7)));
		stack.push(new ListNode (new Fraction(5, 85)));
		stack.push(new ListNode (new Fraction(1, 32)));
		
		//print
	}
}
