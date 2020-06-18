package chap02.item1;

public class CircleDrawing implements Drawing {
    @Override
    public void drawLine(int x, int y) {
        System.out.println("Circle Draw Line !!");
    }

    @Override
    public void fill() {
        System.out.println("Circle Fill !!");
    }
}
