package chap06.item34;

import static chap06.item34.PayrollDay.PayType.WEEKDAY;
import static chap06.item34.PayrollDay.PayType.WEEKEND;

public enum PayrollDay {
    MONDAY(WEEKDAY),
    TUESDAY(WEEKDAY),
    WEDNESDAY(WEEKDAY),
    THURSDAY(WEEKDAY),
    FRIDAY(WEEKDAY),
    SATURDAY(WEEKEND),
    SUNDAY(WEEKEND);

    private final PayType payType;

    PayrollDay(PayType payType) {
        this.payType = payType;
    }

    int pay(int minutesWorked, int payRate) {
        return payType.pay(minutesWorked, payRate);
    }

    enum PayType {
        WEEKDAY {
            @Override
            int overtimePay(int minsWorked, int payRate) {
                return minsWorked <= MIN_PER_SHIFT ? 0 : (minsWorked - MIN_PER_SHIFT) * payRate / 2;
            }
        },
        WEEKEND {
            @Override
            int overtimePay(int mins, int payRate) {
                return mins * payRate / 2;
            }
        };

        abstract int overtimePay(int mins, int payRate);
        private static final int MIN_PER_SHIFT = 8 * 60;

        int pay(int minsWorked, int payRate) {
            int basePay = minsWorked * payRate;
            return basePay + overtimePay(minsWorked, payRate);
        }
    }

}
