public class QueueTest{
    public static void main(String[]args){
        QueueADT<Fraction> fr = new QueueADT<Fraction>();
        fr.enqueue(new Fraction(11, 3));
        fr.enqueue(new Fraction(12, 6));
        fr.enqueue(new Fraction(11, 9));
        fr.enqueue(new Fraction(11, 12));
        fr.dequeue();
        fr.print();
    }
}