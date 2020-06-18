package chap02.item1;

import java.time.Instant;
import java.util.Date;

/* 생성자 대신 정적 팩터리 메서드를 고려하라 */
public class ITEM_1 {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(new RectDrawing());
        Shape circle = new Circle(new CircleDrawing());

        rectangle.draw();
        rectangle.drawLine(1, 2);
        rectangle.fill();

        System.out.println();

        circle.draw();
        circle.drawLine(2, 1);
        circle.fill();
    }

}

