public class Test{
    //Exercise 1
    static int CalculatePostfix(String exp){
        StackADT<Integer> stack=new StackADT<Integer>();
        for(int i=0; i<exp.length(); i++){
            char c=exp.charAt(i);
            if(Character.isDigit(c))   stack.push(c - '0');
            else{
                int val1 = stack.pop();
                int val2 = stack.pop();
                switch(c){
                    case '+':
                    stack.push(val2+val1);
                    break;
                     
                    case '-':
                    stack.push(val2- val1);
                    break;
                     
                    case '/':
                    stack.push(val2/val1);
                    break;
                     
                    case '*':
                    stack.push(val2*val1);
                    break;
                }
            }
        }
        return stack.pop();   
    }

    //Exercise 2
    public static boolean isPalindrome(int n){
        QueueADT<Integer> queue = new QueueADT<Integer>();
        StackADT<Integer> stack = new StackADT<Integer>();
        int count = 0;
        while(n>=1){
            queue.enqueue(n%10);
            stack.push(n%10);
            count++;
            n = n/10;
        }
        for(int i=0; i<count; i++){
            if(queue.dequeue()!=stack.pop())    return false;
        }
        return true;
    }

    public static void main(String[]args){
        System.out.println(isPalindrome(1));
        // isPalindrome(1234);
    }
}