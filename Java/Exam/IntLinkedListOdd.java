public class IntLinkedList{
    private Node head;

    public IntLinkedList(){
        this.head = null;
    }

    public Node getHead(){
        return this.head;
    }


    public void addFirst(int data){
        head = new Node(head, data);
    }

    public void addLast(int data){
        if(head==null){  
            head = new Node(null, data);
            return;
        }
        Node tmp = head;
        while(tmp.getNext()!=null)
            tmp = tmp.getNext();
        Node newNode = new Node(null, data);
        tmp.setNext(newNode);
    }

    public boolean removeAt(int pos){
        if(head==null)  return false;
        if(head.getNext()==null){
            head = null;
            return true;
        }
        int i = 1;
        Node tmp = head;
        Node pre = null;
        while(i!=pos){
            if(tmp==null)   return false;
            pre = tmp;
            tmp = tmp.getNext();
            i++;
        }
        if(tmp==null)   return false;
        pre.setNext(tmp.getNext());
        return true;
    }

    public int countOdd(){
        Node tmp = head;
        int count = 0;
        while(tmp!=null){
            if(tmp.getData()%2!=0)
                count++;
            tmp = tmp.getNext();
        }
        return count;
    }

    public int searchKey(int key){
        Node tmp = head;
        int index = 1;
        while(tmp!=null){
            if(tmp.getData()==key)  return index;
            tmp = tmp.getNext();
            index++;
        }
        return -1;
    }

    public boolean checkSort(){
        if(head==null)  return false;
        if(head.getNext()==null)    return true;
        Node tmp = head;
        if(tmp.getData() > tmp.getNext().getData())
            while(tmp.getNext()!=null){
                if(tmp.getData() < tmp.getNext().getData())
                    return false;
                tmp = tmp.getNext();
            }
        if(tmp.getData() < tmp.getNext().getData())
            while(tmp.getNext()!=null){
                if(tmp.getData() > tmp.getNext().getData())
                    return false;
                tmp = tmp.getNext();
            }
        return true;
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