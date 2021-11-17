import java.*;

public class test{
    public static int countEvenNumber(MyList<Integer> list) {
        Node<Integer> tmp = list.head();
        int count = 0;
        while(tmp != null){
            if(tmp.getData()%2==0)
                count++;
            tmp = tmp.getNext();
        }
        return count;
    }
    public static boolean checkPrime(int number){
        if (number<2)    return false;
        for(int i=2; i<number; i++){
            if(number%i==0)
                return false;
        }
        return true;
    }
    public static int countPrimeNumber(MyList<Integer> list) {
        Node<Integer> tmp = list.head();
        int count = 0;
        while(tmp != null){
            if(checkPrime(tmp.getData()))
                count++;
            tmp = tmp.getNext();
        }
        return count;
    }

    public static Node<Integer> first2Number(MyList<Integer> ls){
        Node<Integer> tmp = ls.head();
        while(tmp!=null){
            if(tmp.getData()==2)
                return tmp;
            tmp = tmp.getNext();
        }
        return tmp;
    }

    //Exercise 8/1 - LAB 3
    public static int addSortedList(MyList<Integer> l, int item){
        Node<Integer> tmp = l.head();
        Node<Integer> pre = null;
        while(tmp!=null){
            if(tmp.getData() >= item) break;
            pre = tmp;
            tmp = tmp.getNext();
        }
        if(tmp==null)   return -1;
        Node<Integer> newNode = new Node<Integer>(item, tmp);
        pre.setNext(newNode);
        return tmp.getData();
    }


    //Exercise 8/2 - LAB 3
    public static int sumAllList(MyList<Integer> l){
        int sum = 0;
        Node<Integer> tmp = l.head();
        if(tmp==null)  return sum;
        while(tmp!=null){
            sum += tmp.getData();
            tmp = tmp.getNext();
        }
        return sum;
    }

    public static void main (String[] args){
        MyList<Integer> ls = new MyList<Integer>();
        ls.addLast(1);        ls.addLast(2);        ls.addLast(3);
        ls.addLast(4);        ls.addLast(5);        ls.addLast(6);
        ls.addLast(7);        ls.addLast(11);       ls.addLast(13);
        ls.print();
        System.out.println(addSortedList(ls, 9));
        ls.print();
        MyList<Integer> lt = new MyList<Integer>();
        lt.addLast(1);        lt.addLast(2);        lt.addLast(3);
        System.out.println(sumAllList(lt));


        // System.out.println(countEvenNumber(ls) );
        // System.out.println(countPrimeNumber(ls));
        // ls.removeCurr(first2Number(ls));
        // ls.print();
        // MyList<Fraction> fr = new MyList<Fraction>();
        // fr.addLast(new Fraction(12, 3));
        // fr.addLast(new Fraction(11, 3));
        // fr.addLast(new Fraction(11, 1));
        // fr.print();
        // Fraction a = new Fraction(10, 5);
        // Fraction b = new Fraction(2, 1);
        // System.out.println(a.equals(b));
    }
}