public class Cau3{
    public static int recur(int a, int b){
        if(b==0)    return a;
        return recur(b, a % b);
    }

    public static void main(String[]args){
        System.out.println(recur(3, 6));
    }
}