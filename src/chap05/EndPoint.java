package chap05;

import chap06.item34.Operation;

public class EndPoint {

    public static void main(String[] args) {
        double x = 3.123;
        double y = 6.323;
        for (Operation op : Operation.values())
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));

        Operation op = Operation.valueOf("+");
        System.out.println(op);

    }

}