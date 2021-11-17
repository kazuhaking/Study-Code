public class DoubleTest{
    public static void main(String [] args){
        DoubleList ls = new DoubleList();
        ls.add(2);
        ls.add(4);
        ls.add(6);
        ls.add(8);
        ls.add(1);
        ls.add(3);
        ls.add(5);
        ls.add(7);
        ls.remove(4);
        ls.print(); 
        System.out.println(ls.find(1));
    }
}