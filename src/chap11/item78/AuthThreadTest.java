package chap11.item78;

public class AuthThreadTest {
    private static final AuthThreadTest instance = new AuthThreadTest();

    int id;

    public static AuthThreadTest getInstance() {
        return instance;
    }

    public int getId() {
        return id++;
    }
}

class Test {
    public static void main(String[] args) {
        AuthThreadTest instance = AuthThreadTest.getInstance();
        int[] kk = new int[30];
        int[] array = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };

        for(int i : array) {
            new Thread(() -> {
                kk[i] = instance.getId();
                System.out.println(kk[i]);
            }).start();

        }
    }
}
