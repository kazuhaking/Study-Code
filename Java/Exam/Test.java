public class Test{
    public static void main(String[]args){
        LinkedList list = new LinkedList();
        list.addFirst(6);
        list.addFirst(3);
        list.addFirst(5);
        list.addFirst(2);
        list.print();

    
        System.out.println(list.sumOdd());
    }
}