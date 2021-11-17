public class QueueADT<E>{
    private QueueNode<E> front;
    private QueueNode<E> rear;
    private int num;

    public QueueADT(){
        this(null, null, 0);
    }
    public QueueADT(QueueNode<E> front, QueueNode<E> rear, int num){
        this.front = front;
        this.rear  = rear;
        this.num   = num;
    }

    public int getNum(){
        return this.num;
    }

    public void enqueue(E data){
        if(num==0){
            front = new QueueNode<E>(data, null);
            num++;
            rear = front;
        }else{
            QueueNode<E> tmp = new QueueNode<E>(data, null);
            rear.setNext(tmp);
            rear = tmp;
            num++;
        }
    }
    public E dequeue(){
        if(num==0)  return null;
        QueueNode<E> tmp = front;
        front = front.getNext();
        num--;
        return tmp.getData();
    }

    public void print(){
        QueueNode<E> tmp = front;
        while(tmp!=null){
            System.out.print(tmp.getData() + "  ");
            tmp = tmp.getNext();
        }   if(num==0)  System.out.println("Queue is empty!");
        System.out.println();
    }
}