public class Sorting{
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

    public static void print(int []arr) {
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+"  ");
        System.out.println();
    }

    public static void main(String[]args){
        int[]a = {5, 1, 2, 6, 4, 3};
        InsertionSort(a);
    }
}
