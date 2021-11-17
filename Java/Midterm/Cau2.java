import java.util.Stack;

public class Cau2{
    public static boolean checkPalindrome(String text){
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i<text.length(); i++)
            stack.push(text.charAt(i));
        String reverse = "";
        while(!stack.isEmpty())
            reverse += stack.pop();
        if(text.equals(reverse))
            return true;
        return false;
    }

    public static void main(String[]args){
        String s = "nguyen";
        System.out.println(checkPalindrome(s));
    }
}