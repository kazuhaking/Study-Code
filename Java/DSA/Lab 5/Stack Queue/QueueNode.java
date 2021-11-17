public class QueueNode<E>{
    public E data;
    public QueueNode<E> next;
    
    public QueueNode(){
        this(null, null);
    }
    public QueueNode(E data){
        this(data, null);
    }
    public QueueNode(E data, QueueNode<E> next){
        this.data = data;
        this.next = next;
    }

    public E getData(){
        return this.data;
    }
    public QueueNode<E> getNext(){
        return this.next;
    }
    public void setNext(QueueNode<E> next){
        this.next = next;
    }
}