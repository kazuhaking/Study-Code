public class IntLinkedList implements ListInterface{
    public Node head;

    public IntLinkedList(){
        this(null);
    }

    public IntLinkedList(Node head){
        this.head = head;
    }

    public Node getHead(){
        return this.head;
    }

    public void addFirst(int data){
        head = new Node(data, head);
    }

    public int sumOdd(){
        Node tmp = head;
        int sum = 0;
        while(tmp!=null){
            if(tmp.getData()%2!=0)
                sum+=tmp.getData();
            tmp = tmp.getNext();
        }
        return sum;
    }

    public void print(){
        Node tmp = head;
        System.out.println("Print:");
        while(tmp!=null){
            System.out.print(tmp.getData() + " ");
            tmp = tmp.getNext();
        }
    }

    public void addLast(int data){
        Node tmp = head;
        while(tmp.getNext()!=null)
            tmp = tmp.getNext();
        tmp.setNext(new Node(data, null));
    }

    public void addAt(int data, int key){
        Node tmp = head;
        Node pre = null;
        if(head==null)  addFirst(data);
        while(tmp!=null){
            if(tmp.getData()==key)  break;
            pre = tmp;
            tmp = tmp.getNext();
        }
        if(tmp==null)   return; //Null element equals with key
        else            
            // pre.setNext(new Node(data, tmp));   After
            tmp.setNext(new Node(data, tmp.getNext()));
    }
}