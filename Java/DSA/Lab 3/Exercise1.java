public class Exercise1{
    public static int a(int n) {
        int sum = 1;
        for(int i=1; i<=n; i++)
            sum*=i;
        return (n<1) ? 0 : sum;
    }

    public static double b(int x, int n){
        if(x==0)    return 0;
        if(n==0)    return 1;
        double ans = 1;    boolean k=false; 
        if(n<0) {   
            n=-n;   
            k=true;
        }
        for(int i=1; i<=n; i++)
            ans*=x;
        if(k) return 1/ans;
        return ans;
    }
    
    public static int c(int number){
        if(number<1) return -1;
        int count=1;
        while(number>9){
            count++;
            number/=10;
        }
        return count; 
    }

    public static boolean d(int number){
        if(number<=1)   return false;
        for(int i=2; i<=number/2; i++){
            if(number%i==0) return false;
        }
        return true;
    }

    public static int e(int a, int b){
        while(a!=b){
            if(a>b) a = a-b;
            else    b = b-a;
        }
        return a;
    }

    public static void main(String[]args){
        System.out.println(e(11, 13));
    }
}