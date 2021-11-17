public class DoubleList{
    private DoubleNode head;
    private int num;

    public DoubleList(){
        this(null, 0);
    }

    public DoubleList(DoubleNode head, int num){
        this.head = head;
        this.num  = num;
    }

    public DoubleNode head(){
        return this.head;
    }

    public void add(double data){
        if (num==0)
            head = new DoubleNode(data, null);
        else{
            DoubleNode tmp = head;
            while(tmp.getNext()!=null)
                tmp = tmp.getNext();
            tmp.setNext(new DoubleNode(data, null));
        }
        num++;
    }

    public double remove(double number){
        DoubleNode tmp = head;
        DoubleNode pre = null;
        if(num==0)  return -1;
        while(tmp.getNext()!=null){
            pre = tmp;
            tmp = tmp.getNext();
            if(tmp.getData()==number){
                pre.setNext(tmp.getNext());
                num--;
                return tmp.getData();
            }
        }
        return -1;
    }

    public boolean find(double number){
        DoubleNode tmp = head;
        if(num==0)   return false;
        while(tmp!=null){
            if(tmp.getData()==number)
                return true;
            tmp = tmp.getNext();
        }
        return false;
    }

    public void print(){
        DoubleNode tmp = head;
        if(tmp==null)
            System.out.println("List is empty!");
        while(tmp!=null){
            System.out.print(tmp.getData() + " ");
            tmp = tmp.getNext();
        }
        System.out.println();
    }
}