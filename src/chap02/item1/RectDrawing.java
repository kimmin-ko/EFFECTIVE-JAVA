package chap02.item1;

public class RectDrawing implements Drawing {

    @Override
    public void drawLine(int x, int y) {
        System.out.println("Rect Draw Line !!");
    }

    @Override
    public void fill() {
        System.out.println("Rect Fill !!");
    }
}
