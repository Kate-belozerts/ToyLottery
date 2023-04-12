package factory;

public abstract class ToysFactory {
    private static final int MAX_COUNT = 10;

    public static int getMaxCount() {
        return MAX_COUNT;
    }
}
