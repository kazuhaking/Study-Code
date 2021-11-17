public class Exercise2{
    public static int a(int n) {
        if(n==1)    return 1;
        return a(n-1)*n;
    }

    private static int b(int x, int n) {
        if(n<1)     return -1;
        if(n==1)    return x;
        return x*b(x, n-1);
    }

    public static int c(int number) {
        if(number<1)     return -1;
        if(number<10)    return 1;
        return 1 + c(number/10);        
    }

    public static int d(int a, int b){
        if(a==b)    return a;
        return (a>b) ? d(a-b, b) : d(a, b-a);
    }

    public static void main(String[]args) {
        System.out.println(b(4, 6));
    }
}