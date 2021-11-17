public class Exercise6{
    public static int a(int[]arr){
        int min = arr[0];
        for(int i=0; i<arr.length; i++)
            if(arr[i]<=min)
                min=arr[i];
        return min;
    }

    public static int b(int[]arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++)
                sum+=arr[i];
        return sum;
    }

    public static int c(int[]arr){
        int count = 0;
        for(int i=0; i<arr.length; i++)
            if(arr[i]%2==0)
                count++;
        return count;
    }
    
    public static void main(String[]args){
        int [] arr = {4,2,3};
        System.out.println(a(arr));
        System.out.println(b(arr));
        System.out.println(c(arr));
    }
}