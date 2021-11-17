import java.util.*;
public class TestQueue {
	public static void main (String[] args) {
		// you can use any one of the following implementations
		//QueueArr <String> queue= new QueueArr <String> (); // Array
		QueueLL <Fraction> queue= new QueueLL <Fraction> (); // LinkedList composition
		//QueueLLE <String> queue= new QueueLLE <String> (); // LinkedList inheritance

		System.out.println("queue is empty? " + queue.isEmpty());
		queue.offer(new Fraction(3, 4));
		queue.offer(new Fraction(2, 5));

		Fraction test = new Fraction();
		System.out.println("Multiply between two number is " + test.multiply(new Fraction(5, 6), new Fraction(3, 7)));
	}
}	