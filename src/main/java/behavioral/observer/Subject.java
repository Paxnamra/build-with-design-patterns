package behavioral.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

//basic subject
public abstract class Subject {

    private List<Obsever> obseververs = new ArrayList<>();

    abstract void setState(String state);
    abstract String getState();

    public void attach(Obsever observer) {
       obseververs.add(observer);
    }

    public void detach(Observer observer) {
        obseververs.remove(observer);
    }

    public void notifyObservers() {
        for (Obsever observer : obseververs) {
            observer.update();
        }
    }

}
