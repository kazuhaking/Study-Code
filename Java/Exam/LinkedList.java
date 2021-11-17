public class LinkedList implements IntLiskInterface{
    public Node head;

    public LinkedList(){
        this.head = head;
    }

    public Node getHead(){
        return this.head;
    }

    public void addFirst(int data){
        head = new Node(head, data);
    }

    public int sumOdd(){
        Node tmp = head;
        int  sum = 0;
        while(tmp!=null){
            if(tmp.getData()%2!=0)
                sum+=tmp.getData();
            tmp = tmp.getNext();
        }
        return sum;
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