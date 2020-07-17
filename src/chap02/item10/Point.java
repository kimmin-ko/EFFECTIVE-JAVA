package chap02.item10;

public class Point {
    private final int x;
    private final int y;
    private final boolean b;
    private final double d;

    public Point (int x, int y, boolean b, double d) {
        this.x = x;
        this.y = y;
        this.b = b;
        this.d = d;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (x != point.x) return false;
        if (y != point.y) return false;
        if (b != point.b) return false;
        return Double.compare(point.d, d) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = x;
        result = 31 * result + y;
        result = 31 * result + (b ? 1 : 0);
        temp = Double.doubleToLongBits(d);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", b=" + b +
                ", d=" + d +
                '}';
    }
}
