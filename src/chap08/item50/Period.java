package chap08.item50;

import java.util.Date;

public class Period {
    // Date는 낡은 API. 사용하면 안됨
    // LocalDate는 불변 클래스이므로 Date 대신 LocalDate를 사용한다면 방어적 복사본을 만들지 않아도 됨
    private final Date start;
    private final Date end;

    public Period(Date start, Date end) {
        // 가변 매개변수의 방어적 복사
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());

        // 방어적 복사 이후에 유효성 검사
        if (this.start.compareTo(this.end) > 0)
            throw new IllegalArgumentException(this.start + "가 " + this.end + "보다 늦다.");
    }

    public Date start() {
        return new Date(start.getTime());
    }

    public Date end() {
        return new Date(end.getTime());
    }

}
