public class StackADT<E>{
    private StackNode<E> top;
    private int size;
    
    public StackADT(){
        this(null, 0);
    }
    public StackADT(StackNode<E> top, int size){
        this.top  = top;
        this.size = size;
    }

    public StackNode<E> getTop(){
        return this.top;
    }
    public int getSize(){
        return this.size;
    }

    public void push(E item){
        top = new StackNode<E>(item, top);
        size++;
    }
    
    public E pop(){
        if (size==0)    return null;
        StackNode<E> tmp = top;
        top = top.getNext();
        size--;
        return tmp.getData();
    }

    public void print(){
        StackNode<E> tmp = top;
        while(tmp!=null){
            System.out.print(tmp.getData() + "  ");
            tmp = tmp.getNext();
        }   if(size==0)  System.out.println("Stack is empty!");
        System.out.println();
    }
}