package chap04;

public class TopClass {

    private static String a;
    private String b;

    public TopClass() {

    }

    public NonStaticMemberClass sub() {
        return new NonStaticMemberClass();
    }

    // public 정적 멤버 클래스
    public static class StaticMemberClass {

    }

    // 비정적 멤버 클래스
    public class NonStaticMemberClass {
        public void a() {
            TopClass.this.b = "";
        }
    }

}
