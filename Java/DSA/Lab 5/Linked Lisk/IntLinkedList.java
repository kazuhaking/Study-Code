public class IntLinkedList{
    private Node head;

    public IntLinkedList(){
        this.head = null;
    }

    public void addFirst(int data){
        head = new Node(data, head);
    }

    public boolean addLast(int data){
        if(head==null){
            addFirst(data);
            return true;
        }
        Node tmp = head;
        while(tmp.getNext()!=null){
            if(tmp.getData()==data) return false;
            tmp = tmp.getNext();
        }
        tmp.setNext(new Node(data, null));
        return true;
    }

    public boolean removeAt(int pos){
        Node tmp = head, pre = null;
        int i = 1;
        while(i!=pos){
            pre = tmp;
            tmp = tmp.getNext();
            i++;
        }
        pre.setNext(tmp.getNext());
        return true;
    }

    public int countOdd(){
        Node tmp = head;
        int count = 0;
        while(tmp.getNext()!=null){
            if(tmp.getData()%2==0)
                count++;
            tmp = tmp.getNext();
        }
        return (count!=0) ? count : -1;
    }

    public int searchKey(int key){
        int count = 1;
        Node tmp = head;
        while(tmp!=null){
            if(tmp.getData()==key) return count;
            tmp = tmp.getNext();
            count++;
        }
        return -1;
    }

    public boolean checkSorted(){
        Node tmp = head;
        if(tmp==null)           return false;
        if(tmp.getNext()==null) return true;
        while(tmp.getNext()!=null){
            if(tmp.getData() > tmp.getNext().getData()) return false;
            tmp = tmp.getNext();
        }
        return true;
    }

    public void print(){
        Node tmp = head;
        while(tmp!=null){
            System.out.println(tmp.getData() + "  ");
            tmp = tmp.getNext();
        }
    }
}