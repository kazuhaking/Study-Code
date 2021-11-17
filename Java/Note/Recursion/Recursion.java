class Recursion {
    static int i = 2;

    static void Fibonacci(int n) {
        int num1 = 0, num2 = 1;
  
        while (num1 < n) {
  
            System.out.print(num1 + " ");
  
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
    }
    static int Factorial (int x, int n) { //x^n
        if (n==1)
            return x;
        return Factorial(x, n-1)*x;
    } 
    static int CountDigitOfNumber(int n) {
        if (n<10)
            return 1;
        return CountDigitOfNumber(n/10) + 1;
    }
    static boolean isPrime(int n) {
        if (n <= 2) 
            return (n == 2) ? true : false; 
        if (n % i == 0) 
            return false; 
        if (i * i > n) 
            return true; 
        i++;
        return isPrime(n);
    }
    static int GCD (int x, int y) {
        if (y == 0)
            return x;
        else
            return GCD(y,x%y);
    }

    public static void main(String args[]) {
        // Function Fibonacci Call
        System.out.print("List Fibonacci: ");
        Fibonacci(25);   System.out.println();

        // Function Compute x^n
        System.out.println("Compute x^n = " + Factorial(2, 10));

        // Function Count digit of number
        System.out.println("Count digit of number: " + CountDigitOfNumber(12345));

        // Function for checking prime number
        System.out.println("Prime number is " + isPrime(97));
        
        // Find the Greatest Common Divisor (2 number)
        System.out.println("GCD is " + GCD(108, 18));
    }
}