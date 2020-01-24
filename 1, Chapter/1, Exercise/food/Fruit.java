package food;

public abstract class Fruit {
    private String name;
    private boolean fresh;
    private int sweetness;
    private int tartness;

    public abstract void goRotten();
    public abstract void getOlder();
    public abstract String getName();
    public abstract boolean getFreshness();
    public abstract int getSweetness();
    public abstract int getTartness();
}