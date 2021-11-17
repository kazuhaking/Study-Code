public class Cau3   {
    public static int recur(int n){
        if(n==1)    return 3;
        if(n==0)    return 4;               
        return recur(n-1) - recur(n-2) - 1;
    }
    
    public static void main(String[]args){
        System.out.println(recur(2));
    }
}