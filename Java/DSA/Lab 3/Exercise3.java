public class Exercise3{
    public static boolean checkPrime(int n, int d){
        if (n <= 2)
            return ((n == 2) ? true : false);
        if (n % d == 0)     return false;
        if (d * d > n)      return true;
        return checkPrime(n, d + 1);
    }

    public static void main(String[]args) {
        System.out.println(checkPrime(11, 10));
    }
}