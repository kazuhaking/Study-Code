public class Exercise4{
    public static int a(int n) {
        if(n<1)     return -1;
        if(n==1)    return 3;
        return (2*n+1) + a(n-1);
    }
    
    public static int fac(int n){ int c=1;
        for(int i=1; i<=n; i++)       c*=i;
        return c;
    }

    public static int b(int n) {
        if(n<1)     return -1;
        if(n==1)    return 1;
        return fac(n) + b(n-1);
    }

    public static int c(int n) {
        if(n<1)     return -1;
        if(n==1)    return 1;
        return fac(n) * b(n-1);
    }

    public static int d(int n, int r) {
        if(n<=r && r<0)    return 1;
        return (n-r)*d(n, r-1);
    }
    
    public static int e(int n) {
        if(n<1)     return -1;
        if(n==1)    return 3;
        return 2^n + n*n + e(n-1);
    }
    public static void main(String[]args) {
        System.out.println(e(4));
    }
}