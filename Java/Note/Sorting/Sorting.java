class Sorting
{   
    // Cau 1
    public static void selection(int[] a)
    {
        int m, t;
        System.out.println("Selection Sort 1");
        for(int i = 0; i<a.length-1; ++i)
        {
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
    
    public static void bubble (int[] a)
    {
        int t, dem = 0;
        System.out.println("Bubble Sort 1");
        for(int i = 0;i<a.length-1; ++i){
            for(int j = a.length-1; j>i; --j){
                if(a[j] < a[j-1])
                {
                    
                    

                    t = a[j];
                    a[j] = a[j-1];
                    a[j-1] = t;
                }
            }
            System.out.print("Step " + dem++ + ": ");
            print(a);
        }
        System.out.println("\n");
    }

    public static void insertion(int[] a) 
    {
        int next, j, dem = 0;
        System.out.println("Inserion Sort 1");
        for (int i=1;i<a.length;i++) { 
            next = a[i];
            for (j=i-1; j>=0 && a[j]>next; j--)
                a[j+1] = a[j];
            a[j+1] = next;  
            System.out.print("Step " + dem++ + ": ");
            print(a);
        }
        System.out.println("\n");
    }    

    //Cau 2 ---------------------------------------------------
    public static void selection2(int[] a)
    {
        int m, t;
        System.out.println("Selection Sort 2");
        for(int i = 0; i<a.length-1; ++i)
        {
            m = i;
            System.out.print("Step " + i + ": ");
            for(int j = i+1; j<a.length; ++j)
                if(a[m] < a[j])
                    m = j;
            print(a);
            //swap
            t = a[m];
            a[m] = a[i];
            a[i] = t;
        }
        System.out.println("\n");
    }
    
    public static void bubble2 (int[] a)
    {
        int t, dem = 0;
        System.out.println("Bubble Sort 2");
        for(int i = 0;i<a.length-1; ++i){
            for(int j = a.length-1; j>i; --j){
                if(a[j] > a[j-1])
                {
                    System.out.print("Step " + dem++ + ": ");
                    print(a);

                    t = a[j];
                    a[j] = a[j-1];
                    a[j-1] = t;
                }
            
            }
        }
        System.out.println("\n");
    }

    public static void insertion2(int[] a) 
    {
        int next, j, dem = 0;
        System.out.println("Insertion Sort 2");
        for (int i=1;i<a.length;i++) { 
            next = a[i];
            for (j=i-1; j>=0 && a[j]<next; j--)
                a[j+1] = a[j];
            a[j+1] = next;  
            System.out.print("Step " + dem++ + ": ");
            print(a);
        }
        System.out.println("\n");
    }
    public static void print(int[] a)
    {
        for(int i = 0; i<a.length; ++i)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    //Cau 3---------------------------------------------------------
    public static void selectionMaxStyle(int[] a)
    {
        int m, t;
        System.out.println("Selection Sort (Max Style)");
        for(int i = 0; i<a.length-1; ++i)
        {
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

    //Cau 4---------------------------------------------------------
    public static void bubbleBeginToEnd (int[] a)
    {
        int t, dem = 0;
        System.out.println("Bubble Sort (Begin to End)");
        for(int i = 0;i<a.length-1; ++i){
            for(int j = a.length-1; j>i; --j){
                if(a[j] > a[j-1])
                {
                    System.out.print("Step " + dem++ + ": ");
                    print(a);

                    t = a[j];
                    a[j] = a[j-1];
                    a[j-1] = t;
                }
            
            }
        }
        System.out.println("\n");
    }

    //Driver Code
    public static void main(String[] arg)
    {   
        int[] a = {8, 10, 1, 6, 5};
        int[] b = {8, 10, 1, 6, 5};
        int[] c = {8, 10, 1, 6, 5};
        System.out.println("Cau 1\n");
        selection(a);
        bubble(b);
        insertion(c);

        int[] e = {8, 10, 1, 6, 5};
        int[] f = {8, 10, 1, 6, 5};
        int[] g = {8, 10, 1, 6, 5};
        System.out.println("Cau 2\n");
        selection2(e);
        bubble2(f);
        insertion2(g);

        int[] m = {8, 10, 1, 6, 5};
        System.out.println("Cau 3\n");
        selectionMaxStyle(m);

        int[] n = {8, 10, 1, 6, 5};
        System.out.println("Cau 4\n");
        bubbleBeginToEnd(n);
    }
}