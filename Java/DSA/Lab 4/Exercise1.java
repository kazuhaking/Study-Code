public class Exercise1{
    public static void SelectionSort(int[]arr){
        int min, tmp;
        for(int i=0; i<arr.length; i++){
            min = i;
            for(int j=i+1; j<arr.length; j++)
                if(arr[min]>arr[j])
                    min = j;
            if(arr[i]>arr[min]){
                tmp = arr[i];
                arr[i] = arr[min];
                arr[min] = tmp;
            }
        }
        print(arr);
    }

    public static void BuddleSort(int[]arr){
        int tmp;
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
            print(arr);
        }
    }

    public static void InsertionSort(int[]arr) {
        int key, j;
        for(int i=1; i<arr.length; i++){
            key = arr[i];
            j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j = j-1;
                print(arr);
            }
            arr[j+1] = key;
        }
    }

    public static void print(int []arr) {
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+"  ");
        System.out.println();
    }

    public static void main(String[]args) {
        int [] inputTenThousand = new int[1000000]; 
        for (int a = 0; a < inputTenThousand.length; a++) {
            inputTenThousand [a] = (int) (Math.random () * 100000);
        }

        SelectionSort(inputTenThousand);
    }
}