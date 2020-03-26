package human;

public class Human implements Curable {
    boolean ill = false;

    @Override
    public boolean isIll() {
        return ill;
    }

    @Override
    public void getBetter() {
        ill = false;
    }
}
