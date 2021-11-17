class Fraction {
    private static  int numberOfFractions = 0;
    public int getSize() {
        return numberOfFractions;
    }


    private int numerator;
    private int denominator;

    public Fraction(int n, int d) {
        if (d == 0) {
            System.out.println("demrator must be other than 0");
            return;
        }
        numberOfFractions++;
        this.numerator = n; 
        this.denominator = d;
    }

    public Fraction(int n) {
        this(n, 1);
    }

    public Fraction() {
        this(0,1);
    }

    public Fraction(Fraction original) {
        this(original.numerator,original.denominator);
    }

    static private int gcd (int x, int y) {
        if (y == 0)
            return x;
        else
            return gcd(y,x%y);
    }

    public String toString() {
        int thisGcd = gcd(numerator, denominator);

        return (numerator / thisGcd + "/" + denominator / thisGcd);
    }
  }