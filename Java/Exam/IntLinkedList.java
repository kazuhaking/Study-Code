public class IntLinkedList{
    public Node head;

    public IntLinkedList(){
        this.head = null;
    }

    public Node getHead(){
        return this.head;
    }

    public void addFirst(int data){
        head = new Node(head, data);
    }

    public boolean addAfterFirstKey(int data, int key){
        Node tmp = head;
        Node pre = null;
        if(head==null)  return false;
        while(tmp!=null){
            if(tmp.getData()==key){
                Node newNode = new Node(tmp, data);
                pre.setNext(newNode);
                return true;
            }
            pre = tmp;
            tmp = tmp.getNext();
        }
        return false;
    }

    public void print(){
        Node tmp = head;
        while(tmp!=null){
            System.out.print(tmp.getData() + " ");
            tmp = tmp.getNext();
        }
        System.out.println();
    }
}