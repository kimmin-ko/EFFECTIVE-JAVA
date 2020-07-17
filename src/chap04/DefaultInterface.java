package chap04;

public interface DefaultInterface {

    default int addIJ(int i, int j) {
        return i + j;
    }

}
