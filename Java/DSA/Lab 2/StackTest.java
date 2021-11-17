public class StackTest{
    //Exercise 3
    public static StackADT<Integer> ex3_var = new StackADT<Integer>();

    public static void ex3(int n){
        if(n<-1) return;
        if(n==1){
            ex3_var.push(3);   
            return;
        }
        ex3_var.push((int)Math.pow(2, n) + n*n);
        ex3(n-1);
    }

    public static int ex3(){
        int sum = 0;
        while(ex3_var.getTop()!=null)
            sum+=ex3_var.pop();
        return sum;
    }

    
    //Exercise 4
    public static StackADT<Character> ex4_var = new StackADT<Character>();

    public static void ex4(Character[] ls, int n){
        if(n<0) return;
        if(n==0){
            ex4_var.push(ls[0]);
            return;
        }
        ex4_var.push(ls[n]);
        ex4(ls, n-1);
    }

    public static void ex4(){
        while(ex4_var.getTop()!=null)
            System.out.print(ex4_var.pop());
    }

    public static boolean is_palindrome(String input){
        QueueADT<Character> q = new QueueADT<Character>();
        StackADT<Character> s = new StackADT<Character>();

        Character letter;
        int mismatches = 0;
        
        for (int i=0; i<input.length(); i++){
            letter = input.charAt(i);
            if (Character.isLetter(letter)){
                q.enqueue(letter);
                s.push(letter);
            }
        }
        while (q.getNum()!=0){
            if (q.dequeue() != s.pop())
                mismatches++;
        }
        return (mismatches == 0);
    }


    //Driver Code
    public static void main(String[]args){
        // StackADT<Fraction> fra = new StackADT<Fraction>();
        // fra.push(new Fraction(11, 3));
        // fra.push(new Fraction(11, 6));
        // fra.push(new Fraction(11, 9));
        // fra.pop();
        // fra.print();

        //          Test execrise 3
        // ex3(4);
        // ex3_var.print();      
        // System.out.println(ex3()); 
        // ex3_var.print();   

        //          Test execrise 4
        // Character[] ch = {'c', 'h', 'a', 'r', 'a', 'c', 't', 'e', 'r'};
        // ex4(ch, ch.length-1);
        // ex4_var.print();
        // ex4();
        // ex4_var.print();

        //  Exercise 6: Show how to implement a Queue using two Stack
        /*
            How to implement a Queue using two Stack:
                - First one: Stack is LIFO, so push a, then we have reverse a
                - Go on:     Create a new Stack and pop each other item from old Stack
                - Finnaly:   We have a new Stack and they do not reverse and equals than Queue
            Therefore, we can implement any Queue by Stack and show it, but if input then we are diffirent
        */

        //Exercise 7
        String palindrome = "amanaplanacanalPanama";
        String not_palindrome = "awomeninblackisbanana";

        System.out.println(is_palindrome(palindrome));
        System.out.println(is_palindrome(not_palindrome));
    }
}