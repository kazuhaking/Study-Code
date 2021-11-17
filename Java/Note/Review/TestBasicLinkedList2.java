import java.util.*;

public class TestBasicLinkedList2 {
	public static void main(String [] args) 
		                   throws NoSuchElementException {
		BasicLinkedList <Student> list = new BasicLinkedList <Student>();
		System.out.println("Enter number of student: ");
        Scanner sc = new  Scanner(System.in);
		int n = sc.nextInt();
		String ID, name;
		Student dem;
		double score;
		//Cau 1--------------------------------------
		for(int i = 0; i<n; ++i){					 // Example input: Line 1: ID + " " + name [Enter]
			System.out.println("Enter information:");//				   Line 2: score [Enter]
			sc.nextLine();
			ID   = sc.nextLine();
			name = sc.nextLine();
			score = sc.nextDouble();
			dem = new Student (ID, name, score);
			list.addLast(dem);
		}

		//Cau 2--------------------------------------
		list.print();

		//Cau 3--------------------------------------

	}
}
