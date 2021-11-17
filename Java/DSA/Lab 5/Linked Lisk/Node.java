public class Node{
    public int  data;
    public Node next;

    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    public Node(){
        this(-1, null);
    }

    public int getData(){
        return this.data;
    }

    public Node getNext(){
        return this.next;
    }

    public void setNext(Node next){
        this.next = next;
    }
}