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


public static void SelectionSort(int[]a){
    int min, tmp;
    for(int i=0; i<a.length; i++){
        min = i;
        for(int j=i+1; j<a.length; j++)
            if(a[j]<a[min])
                min = j;
        if(min!=i){
            tmp = a[i];
            a[i] = a[min];
            a[min] = tmp;
        }
        print(a);
    }
}


public static void BuddleSort(int[]a){
    int tmp;
    for(int i=0; i<a.length-1; i++){
        for(int j=0; j<a.length-1-i; j++)
            if(a[j]>a[j+1]){
                tmp = a[j];
                a[j] = a[j+1];
                a[j+1] = tmp;
            }
        print(a);
    }
}



public static void InsertionSort(int[]a){
    int j, max;
    for(int i=1; i<a.length; i++){
        max = a[i];
        j = i-1;
        while(j>=0 && a[j]>max){
            a[j+1] = a[j];
            j--;
        }
        a[j+1]=max;
        print(a);
    }
}

import java.util.Stack;

public class Cau2{
	public static boolean checkPalindrome(String text){
		Stack<Character> stack = new Stack<Character>();
	
		for(int i=0; i<text.length(); i++){
			stack.push(text.charAt(i));
		}
		
		for(int i=0; i<text.length(); i++){
			Character ch = stack.pop();
			if(ch!=text.charAt(i)){
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args){
		System.out.println(checkPalindrome("abcba"));
		System.out.println(checkPalindrome("abccda"));
	}
}