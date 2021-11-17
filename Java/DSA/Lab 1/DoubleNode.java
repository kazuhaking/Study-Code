public class DoubleNode{
    public double data;
    public DoubleNode next;

    public DoubleNode(){
        this(0, null);
    }

    public DoubleNode(double data, DoubleNode next){
        this.data = data;
        this.next = next;
    }

    public double getData(){
        return this.data;
    }

    public DoubleNode getNext(){
        return this.next;
    }

    public void setNext(DoubleNode next){
        this.next = next;
    }
}