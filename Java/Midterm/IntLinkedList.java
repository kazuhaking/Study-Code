public class IntLinkedList implements ListInterface{
    public Node head;

    public IntLinkedList(){
        this.head = null;
    }

    public Node getHead(){
        return this.head;
    }

    public void addFirst(int data){
        head = new Node(data, head);
    }

    public int countElementGreaterThan(int key){
        Node tmp = head;
        int count = 0;
        if(head==null)  return count;
        while(tmp!=null){
            if(tmp.getData()>key)   count++;
            tmp = tmp.getNext();
        }
        return count;
    }

    public void print(){
        Node tmp = head;
        while(tmp!=null){
            System.out.println(tmp.getData());
            tmp = tmp.getNext();
        }
    }
}