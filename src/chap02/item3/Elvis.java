package chap02.item3;

public class Elvis {
//    public static final Elvis INSTANCE = new Elvis();
    private static final Elvis INSTANCE = new Elvis();
    private Elvis() {}
    public static Elvis getInstance() { return INSTANCE; }

    // 싱글턴임을 보장해주는 메서드
    private Object readResolve() {
        return INSTANCE;

    }
}
