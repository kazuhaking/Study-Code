public class Exercise7{
    public static int a(int[]arr, int n){
        if(n==1)    return arr[0];
        return Math.min(arr[n-1], a(arr, n-1));
    }

    public static int b(int[]arr, int n){
        if(n==1)   return arr[0];
        return arr[n-1] + a(arr, n-1);
    }

    public static int c(int[]arr, int n){
        if(n==1)
            if(arr[0]%2==0) return 1;
            else            return 0;
        return (arr[n-1]%2==0) ? (1 + c(arr, n-1)) : c(arr, n-1);
    }

    public static void main(String[]args){
        int [] arr = {4,2,3,6,4};
        System.out.println(c(arr, arr.length));
    }
}