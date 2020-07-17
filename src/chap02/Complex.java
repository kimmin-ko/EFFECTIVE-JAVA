package chap02;

public class Complex {
    private final double re;
    private final double im;

    private Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public static Complex valueOf(double re, double im) {
        return new Complex(re, im);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Complex)) return false;

        Complex c = (Complex) o;

        if (Double.compare(c.re, re) != 0) return false;
        return Double.compare(c.im, im) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(re);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(im);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "chap02.Complex{" +
                "re=" + re +
                ", im=" + im +
                '}';
    }
}