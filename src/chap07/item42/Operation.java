package chap07.item42;

import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;

public enum Operation {
    PLUS("+",  (x, y) -> x + y),
    MINUS("-", (x, y) -> x - y),
    DIVIDE("*", (x, y) -> x / y),
    TIMES("/", (x, y) -> x * y);

    private final String symbol;
    private final DoubleBinaryOperator op;

    Operation(String symbol, DoubleBinaryOperator op) {
        this.symbol = symbol;
        this.op = op;
    }

    public double apply(double x, double y) {
        return op.applyAsDouble(x, y);
    };

//    public double apply(int x, int y) {
//        return op.applyAsInt(x, y);
//    }

    @Override
    public String toString() {
        return this.symbol;
    }
}
