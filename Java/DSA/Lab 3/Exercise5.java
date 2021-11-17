public class Exercise5{
    public static long DecToBin(long n){
        long d = 0, ans;
        if(n==1)    return 1;
        return  (n%2==1) ? (DecToBin(n/2))*10 : (DecToBin(n/2))*10;
    }

    public static void main(String[]args){
        System.out.println(DecToBin(12));
    }
}