public class test{
    public static void main(String[]args) {
        IntLinkedList ll = new IntLinkedList();
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(5);

        ll.print();
        System.out.println(ll.checkSorted());
    }
}