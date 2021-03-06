/*
Team Incredibly Cohesive (David Chen, Jaylen Zeng, Orion Roven)
APCS pd7
HW42 -- Be More Rational
12/2/21
time elapsed: 0.6 hours
DISCO:
In order for gcd to work we need to start checking for gcd at the minimum value between the numerator and the demonitator
smaller number % a bigger number will return the smaller number
because our compareTo() method uses the .floatValue() method to check if the rationals are equal, a non-reduced rational is equal to a reduced rational
QCC:
Is there a way to use .reduce() in compareTo() that will yield the same results as using .floatValue()?
*/

public class Rational {
    private int denominator;
    private int numerator;

    public static void main(String[] args) {
        Rational a = new Rational(6, 8);
        System.out.println(a.gcd());

        Rational r = new Rational(2, 3);
        Rational s = new Rational(1, 2);
        r.add(s);
        System.out.println(r);

        Rational x = new Rational(4, 3);
        Rational y = new Rational(1, 5);
        x.subtract(y);
        System.out.println(x);

        Rational t = new Rational(4,18);
        t.reduce();
        System.out.println(t);

        Rational q = new Rational(1, 2);
        Rational u = new Rational(1, 2);
        Rational v = new Rational(2, 4);
        System.out.println(q.compareTo(u));//0
        System.out.println(q.compareTo(v));
        System.out.println(q.compareTo(t));
        System.out.println(q.compareTo(r));
    }

    public Rational() {
        denominator = 1;
        numerator = 0;
    }

    public Rational(int num, int denom) {
        this();
        if (denom == 0) {
            System.out.println("Denominator cannot be zero");
            return;
        }
        numerator = num;
        denominator = denom;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public void multiply(Rational num) {
        int newNum = this.numerator * num.numerator;
        int newDom = this.denominator * num.denominator;

        this.numerator = newNum;
        this.denominator = newDom;
    }

    public void divide(Rational num) {
        if (num.numerator == 0)
            System.out.println("ERROR: Cannot divide by 0");
        else {
            numerator *= num.denominator;
            denominator *= num.numerator;
        }
    }

    public double floatValue() {
        return (double) numerator / denominator;
    }

    public int gcd() {
        int gcd = Math.min(this.numerator, this.denominator);
        while (gcd < this.numerator || gcd < this.denominator) {
            if (this.numerator % gcd == 0 && this.denominator % gcd == 0) {
                break;
            }
            gcd--;
        }
        return gcd;
    }

    public void add(Rational num) {
        this.numerator = this.numerator * num.denominator + this.denominator * num.numerator;
        this.denominator = this.denominator * num.denominator;
    }

    public void subtract(Rational num) {
        this.numerator = this.numerator * num.denominator - this.denominator * num.numerator;
        this.denominator = this.denominator * num.denominator;
    }

    public void reduce() {
        int gcd = this.gcd();
        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    public int compareTo(Rational num) {
        if (this.floatValue() > num.floatValue()) {
            return 1;
        } else if (this.floatValue() < num.floatValue()) {
            return -1;
        }
        return 0;
    }

}
