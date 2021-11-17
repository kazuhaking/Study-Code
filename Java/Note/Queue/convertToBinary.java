import java.util.*;

public class convertToBinary {
    public static void main(String[] args) {
        int number; 
     
        Scanner sc = new Scanner(System.in);
     
        System.out.println("Enter number: ");
        number = sc.nextInt();
     
        if (number < 1)
            System.out.println("Error: Not a positive integer");
        else{ 
            System.out.print("Convert to binary is:");
            System.out.print(binary(number));
        }
    }

    private static int binary(int number) {
        int binaryNumber = 0;
        int p = 0;
        while (number > 0)
        {
            binaryNumber += (number % 2) * Math.pow(10, p);
            ++p;
            number /= 2;
        }
        return binaryNumber;
    }
}