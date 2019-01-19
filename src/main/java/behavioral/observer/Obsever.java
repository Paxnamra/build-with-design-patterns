package behavioral.observer;

public abstract class Obsever {
    protected Subject subject;
    abstract void update();
}
