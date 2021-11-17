import java.util.*;

class Array {
    public static int [] inputArray(){
        Scanner sc = new Scanner (System.in);
        System.out.print("How many element in array: ");
        int n = sc.nextInt();
        int arr[] = new int [n];
        for (int i = 0; i<n; i++){
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void outputArrayUsingItera(int [] arr){
        System.out.print("Array: " + arr[0]);
        for (int i = 1; i<arr.length; i++){
            System.out.print(", " + arr[i]);
        }
        return;
    } 
    public static void outputArrayUsingRecur(int [] arr, int n){
        if(n <= 0)
            return;
        System.out.print(", " + arr[n+1]);
        outputArrayUsingRecur(arr, n+1);
    }
    
    public static int calSumUsingItera(int [] arr){
        int sum = 0;
        for (int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static int calSumUsingRecur(int [] arr, int n){
        if (n <= 0) {
           return 0;
        }
        return calSumUsingRecur(arr, n-1) + arr[n-1];
    }

    public static int findMaxUsingItera(int [] arr){
        int max = arr[0];
        for (int i = 0; i<arr.length; i++)
            if (max < arr[i])
                max = arr[i];
        return max;
    }

    public static int findMaxUsingRecur (int [] a,int i, int n){
        int max = 0;
        if (i == (n-1)) {
            return a[i];
        } else if (a[i] < a[n]) {
            return findMaxUsingRecur(a, i + 1, n);
        } else {
            return a[i];
        }
    }

    public static void sortedArray (int [] a)    {
        int m, t;
        System.out.println("\nSorted Array: ");
        for(int i = 0; i<a.length-1; ++i)        {
            m = i;
            System.out.print("Step " + i + ": ");
            for(int j = i+1; j<a.length; ++j)
                if(a[m] > a[j])
                    m = j;
            print(a);
            //swap
            t = a[m];
            a[m] = a[i];
            a[i] = t;
        }
        System.out.println("\n");
    }

    public static int [] SortedInsertion(int[] a) 
    {
        int next, j, dem = 0;
        System.out.println("Insertion Sort: ");
        for (int i=1;i<a.length;i++) { 
            next = a[i];
            for (j=i-1; j>=0 && a[j]>next; j--)
                a[j+1] = a[j];
            a[j+1] = next;  
        }
        return a;
    }

    public static void print(int[] a)    {
        for(int i = 0; i<a.length; ++i)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    //Driver Code
    public static void main (String args[]){
        int [] arr = inputArray();
        outputArrayUsingItera(arr);
        //outputArrayUsingRecur(arr, arr.length);
        System.out.println("\nSum of array: " + calSumUsingItera(arr));
        System.out.println("Sum of array: " + calSumUsingRecur(arr, arr.length));
        System.out.print("Max of array: " + findMaxUsingItera(arr));
        System.out.print("Max of array: " + findMaxUsingRecur(arr, 0, arr[0]));
        sortedArray(arr);
        arr = SortedInsertion(arr);
        print(arr);
        return;
    }
}