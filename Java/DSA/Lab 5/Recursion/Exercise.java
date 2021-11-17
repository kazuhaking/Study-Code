public class Exercise{
    // Exercise 1
    public static double prod_recur(int a, int b){
        if(a==1)    return b;
        return b+prod_recur(a-1, b);
    }

    public static int maxDigit(int n){
        return n==0 ? 0 : Math.max(n%10, maxDigit(n/10));
    }

    public static int bin2dec(int n, int d){
        if(n==1)    return (int)Math.pow(2, d);
        if(n==0)    return 0;
        return (n%10==1) ? (int)Math.pow(2, d) + bin2dec(n/10, d+1) : bin2dec(n/10, d+1);
    }

    public static int maxElement(int[]a, int n){
        return n==0 ? a[0] : Math.max(a[n], maxElement(a, n-1));
    }

    public static int search(int[]a, int n, int key){
        return a[n]==key ? n : search(a, n-1, key);
    }
    
    // Exercise 2
    public static int a_r(int n){
        return n==1 ? 2 : (int)Math.pow(2, n) + a_i(n-1);
    }

    public static int a_i(int n){
        int sum = 0;
        for(int i=1; i<n; i++)  sum += (int)Math.pow(2, n);
        return sum;
    }

    public static double b_r(int x){
        return x==0 ? 0.5 : ((double)x+1)/2 + c_i(x-1);
    }

    public static double b_i(int x){
        int sum = 0;
        for(int i = 0; i<=x; i++)
            sum+=(i+1)/2;
        return sum;
    }

    public static int factorial(int n){
        int ans = 1;
        if(n==0)    return 1;
        for(int i=0; i<=n; i++) 
            ans*=i;
        return ans;
    }

    //Exception in thread "main" java.lang.ArithmeticException: / by zero
    //at Exercise.c_i(Exercise.java:62)
    //at Exercise.main(Exercise.java:68)
    public static double c_r(int n){
        return n==1 ? 1 : (factorial(n)/factorial(n-1)) + c_r(n-1); 
    }

    public static double c_i(int n){
        int ans = 0;
        for(int i=1; i<=n; i++) 
            ans += factorial(i)/factorial(i-1);
        return ans;
    }

    public static int d_r(int n){
        return (n==1) ? 0 : (n*(n-1)) + d_r(n-1);
    }

    public static int d_i(int n){
        int sum = 0;
        for(int i=0; i<=n; i++)
            sum+=(i*(i-1));
        return sum;
    }

    public static int e_r(int n){
        return n==1 ? 1 : n*e_r(n-1);
    }

    public static int e_i(int n){
        int pro = 1;
        for(int i=1; i<=n; i++)
            pro*=i;
        return pro;
    }

    //Exercise 3
    public static double recursion_a(int n){
        return n==0 ? 2 : 2 - (recursion_a(n-1))/2;
    }

    public static int recursion_b(int n){
        return n<10 ? 1 : 1+recursion_b(n/10);
    }

    public static int recursion_c(int n, int k){
        return k==1 ? n : recursion_c(n+recursion_c(n, k-1));
    }

    public static int recursion_d(int n){
        if(n==0)    return 0;
        if(n==1)    return 1;
        return recursion_d(n-1) + recursion_d(n-2);
    }

    public static void main(String[]args) {
        System.out.println(recursion_a(4));
    }
}