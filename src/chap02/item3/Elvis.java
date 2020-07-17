package chap02.item3;

import java.util.Collections;
import java.util.function.Supplier;

public class Elvis {

    private static final Elvis INSTANCE = new Elvis();

    private Elvis() { }

    // 인스턴스에 유일하기 접근할 수 있는 수단
    public static Elvis getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Supplier<Elvis> elvis = () -> { return Elvis.getInstance(); };
        elvis.get();
    }

}
