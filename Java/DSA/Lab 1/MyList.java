public class MyList<E> implements ListInterface<E>{
    private Node<E> head;
    private int num;

    public MyList(){
        head = null;
        num  = 0;
    }

    public Node<E> head(){
        return this.head;
    }
    
    public void addFirst(E item){
        head = new Node(item, head);
        num++;
    }

    public void addLast(E item){
        if (head == null)
            addFirst(item);
        else{
            Node<E> tmp = head;
            while(tmp.getNext()!=null)
                tmp = tmp.getNext();
            Node<E> newNode = new Node<E>(item, null);
            tmp.setNext(newNode);
            num++;
        }
    }

    public E removeFirst(){
        if (num==0)
            return null;
        Node<E> tmp = head;
        head = head.getNext();
        num--;
        return tmp.getData();
    }

    public E removeLast(){
        if (num<=1)
            return removeFirst();
        Node<E> preNode = null;
        Node<E> delNode = head;
        while(delNode.getNext()!=null){
            preNode = delNode;
            delNode = delNode.getNext();
        }
        preNode.setNext(delNode.getNext());
        num--;
        return delNode.getData();
    }

    public void print(){
        if(head != null){
            Node<E> tmp = head;
            System.out.print("List: " + tmp.getData());
            tmp = tmp.getNext();
            while(tmp != null)            {
                System.out.print(" -> " + tmp.getData());
                tmp = tmp.getNext();
            }
            System.out.println();
        }else{
            System.out.println("List is empty!");
        }
    }

    //Exercise 2
    public E removeCurr(Node<E> curr) {
        Node<E> tmp = head;
        while(tmp.getNext()!=curr){
            if(tmp.getNext()==curr) break;
            tmp = tmp.getNext();
        }
        tmp.setNext(curr.getNext());
        return curr.getData();
    }

    //Exercise 8
    // public E addSortedList(E item){
    //     Node<E> tmp = head;
    //     Node<E> pre = null;
    //     while(tmp!=null){
    //         //if(Integer.compare(item, tmp)<0) break;
    //         pre = tmp;
    //         tmp = tmp.getNext();
    //     }
    //     if(tmp==null)   return null;
    //     Node<E> newNode = new Node(item, tmp);
    //     pre.setNext(newNode);
    //     return tmp.getData();
    // }
}