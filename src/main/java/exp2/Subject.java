package exp2;

import java.util.List;

public interface Subject {


    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}

