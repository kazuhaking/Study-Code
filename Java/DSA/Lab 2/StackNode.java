public class StackNode<E>{
    public E data;
    public StackNode<E> next;

    public StackNode(){
        this(null, null);
    }

    public StackNode(E data){
        this(data, null);
    }

    public StackNode(E data, StackNode<E> next){
        this.data = data;
        this.next = next;
    }

    public E getData(){
        return this.data;
    }
    public StackNode<E> getNext(){
        return this.next;
    }
    public void setNext(){
        this.next = next;
    }
}