import java.util.Stack;
import java.util.Queue;
import java.*;
@SuppressWarnings("unchecked")
public class Cau2Odd{    
    public static int CalculatePostfix(char[]exp){          //String n
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0; i<exp.length; i++){                    //length()
            char c = exp[i];                                //char c = exp.charAt(i);
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

    public static boolean checkBalance(char[]expr){         //  String expr
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < expr.length; i++){              //length()
            char x = expr[i];                               // char x = expr.charAt(i);
            if (x == '(' || x == '['){
                stack.push(x);
                continue;
            }
            if (stack.isEmpty())
                return false;

            char check;

            switch (x) {
            case ')':
                check = stack.pop();
                if (check == '[')
                    return false;
                break;
 
            case ']':
                check = stack.pop();
                if (check == '(')
                    return false;
                break;
            }
        }
        return (stack.isEmpty());
    }

    public static boolean isPalindrome(char[]str){     //String str
        Stack stack = new Stack();
        String tmp = "";

        for (int i = 0; i < str.length; i++){           // length()
            stack.push(str[i]);                         //str.charAt(i);
            tmp+=str[i];                                //Clear
        }

        String rev = "";

        while (!stack.isEmpty())
            rev = rev + stack.pop();

        if (tmp.equals(rev))
            return true;
        else
            return false;
    }

    

    public static String reverse(String s){
        Stack<String> stack = new Stack<String>();
        String[]sp = s.split(" ");
        String ans = "";
        for(int i=0; i<sp.length; i++)
            stack.push(sp[i]);
        for(int i=0; i<sp.length; i++){
            ans+=stack.pop();
            if(i==sp.length-1)  break;
            ans+=" ";
        }
        return ans; 
    }

    public static boolean number(int n){
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();
        while(n!=0){
            stack.push(n%10);
            n/=10;
        }
        int ans = 0;
        while(!stack.isEmpty())
            stack2.push(stack.pop());
        while(!stack2.isEmpty())
            ans = ans*10 + stack2.pop();
        return ans==n ? true : false;
    }

    public static void main(String[]args){
        String s = "I like apple";
        System.out.println(reverse(s));

        int n = 12345;
        System.out.println(number(n));        
    }
}