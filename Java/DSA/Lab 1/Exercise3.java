public class Exercise3{
    public static int countNumberEven(MyList<Integer> l){
        Node<Integer> tmp = l.head();
        int count = 0;
        while(tmp!=null){
            if(tmp.getData()%2!=0)
                count++;
            tmp = tmp.getNext();
        }
        return count;
    }

    public static boolean isPrime(int number){
        if(number<2)    return false;
        for(int i=2; i<=Math.sqrt(number); i++)
            if(number%i==0)
                return false;
        return true;
    }

    public static int countPrimeNumber(MyList<Integer> l){
        Node<Integer> tmp = l.head();
        int count = 0;
        while(tmp!=null){
            if(isPrime(tmp.getData()))
                count++;
            tmp = tmp.getNext();
        }
        return count;
    }

    public static void addBeforeFirstEven(MyList<Integer> l, int data){
        Node<Integer> pre = null, tmp = l.head();
        if(tmp.getData()%2==0){
            // Node<Integer> newNode = new Node<Integer>(data, tmp);
            // tmp = newNode;
            l.addFirst(data);
            return;
        }
        if(tmp==null) return;
        while(tmp!=null){
            if(tmp.getData()%2==0)  break;
            pre = tmp;
            tmp = tmp.getNext();
        }
        if(tmp==null && pre.getData()!=0)   return;
        Node<Integer> newNode = new Node<Integer>(data, tmp);
        pre.setNext(newNode);
        return;
    }

    public static int maximumOfList(MyList<Integer> l){
        Node<Integer> tmp = l.head();
        if(tmp==null)   return -1;
        int max = tmp.getData();
        while(tmp!=null){
            if(tmp.getData()>=max)  
                max = tmp.getData();
            tmp = tmp.getNext();
        }
        return max;
    }

    public static void reverse(MyList<Integer> l){
        Node<Integer> i = l.head(), j = l.head();
        Node<Integer> tmp = l.head(), last = null;
        while(tmp!=null)
            tmp = tmp.getNext();
            last = tmp;
        while(i!=null){
            // while(j!=last){
            //     last.setNext(i.getNext());
            //     i.setNext(last.getNext)
            //     i = i.getNext(null);
            //     j = j.getNext();
            }
            i = i.getNext();
        }
    }

    public static void main(String[]args){
        MyList<Integer> list = new MyList<Integer>();
        list.addLast(1);        list.addLast(3);        list.addLast(3);
        list.addLast(5);        list.addLast(50);       list.addLast(9);
        list.addLast(7);        list.addLast(11);       list.addLast(13);

        // list.print();
        // addBeforeFirstEven(list, 9);
        // list.print();
        System.out.println(maximumOfList(list));
    }
}