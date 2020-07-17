package chap04;

public class Super {

    private int count;

    public Super() {

    }

    // 재정의 가능한 메서드는  내부에서 사용하면 안된다.
    // add2의 기능이 변형될 수 있음.
    public void add() {
        this.count++;
    }

    public void add2() {
        add();
        add();
    }

}
