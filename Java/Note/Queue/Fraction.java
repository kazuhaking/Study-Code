class Fraction {
    private static  int numberOfFractions = 0;
    public int getSize() {
        return numberOfFractions;
    }


    public int numerator;
    public int denominator;

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

    public Fraction multiply(Fraction fr1, Fraction fr2){
        int numerator, denominator;

        this.numerator   = (fr1.numerator * fr2.numerator);
        this.denominator = (fr1.denominator * fr2.denominator);
        
        int gcd = gcd(this.numerator, this.denominator);

        return new Fraction(this.numerator/gcd, this.denominator/gcd);
    }

    public String toString() {
        int thisGcd = gcd(numerator, denominator);

        return (numerator / thisGcd + "/" + denominator / thisGcd);
    }
  }