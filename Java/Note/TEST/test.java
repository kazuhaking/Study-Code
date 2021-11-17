public class test{
    public static void main(String[]args){
        IntLinkedList l = new IntLinkedList();
        l.addFirst(1);
        l.addFirst(2);
        l.addFirst(3);
        l.addFirst(4);
        l.addLast(5);
        l.print();

        l.addAt(9, 3);
        l.print();
    }
}