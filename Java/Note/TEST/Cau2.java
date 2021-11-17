import java.util.Stack;

public class Cau2{
    public static boolean checkBalance(char[] input){
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<input.length; i++){
            // if(input=="(" || input==")" || input=="[" || input=="]")
            stack.push(input[i]);
        }
        return true;
    }
    public static void main(String[]args){
        char[]tc = {'(', 'b'};
        System.out.println(checkBalance(tc));
    }
}