public class ChaReverse{
    public static String reverse(Character[] str){
        String ans = ""; 
        Character d;
        char[] reverseString = new char[str.length];
        StackADT<Character> obj = new StackADT<Character>();
        for (int i = 0; i<str.length; i++){
            obj.push(str[i]);
        }
        int i = 0;
        while (i!=obj.getSize()) { 
            reverseString[i++] = obj.pop();
        }
        return new String(reverseString);
    }
    
    public static void main(String [] args){
        Character[] n = {'a', 'b' , 'c'};
        System.out.println(reverse(n));
    }
}