package chap02;

import java.time.Instant;

public final class Sub extends Super {

    private final Instant instant;

    Sub() {
        instant = Instant.now();
    }

    // 재정의 가능 메서드, 상위 클래스의 생성자가 호출한다.
    @Override
    public void overrideMe() {
        System.out.println(instant);
    }

}
