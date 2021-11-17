public class Fraction{
    private int numer, denom;

    public Fraction(int x, int y){
        this.numer = x;
        this.denom = y;
    }

    public Fraction(){
        this(0, 1);
    }

    public Fraction(Fraction f){
        this.numer = f.numer;
        this.denom = f.denom;
    }

    public String toString(){
        if(denom==0)    return "Error Fraction!";
        return numer + "/" + denom;
    }

    public boolean equals(Fraction f){
        if(((double)this.numer/this.denom)==((double)f.numer/f.denom))
            return true;
        return false;
    }
}