package chap06.item34;

public enum Apple {
    A(1),
    B(2),
    C(3),
    D(4);

    private int number;

    Apple(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }
}
