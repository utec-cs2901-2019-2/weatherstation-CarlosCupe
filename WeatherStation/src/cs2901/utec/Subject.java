import java.util.Vector;

public interface Subject implements Observer {
    private vector<Observer> obs;

    public static void main () {
        obs =  new Vector<Observer>();
    }

    public void registerObserver (Observer observer) {
        v.add (observer);
    }

    public void removeObserver (int id) {
        for (int i = 0; i < obs.size(); ++i) {
            if (obs.get(i).getId() == id) {
                obs.remove(i);
                return;
            }
        }
    }

    private void notifyObserver () {
        for (int i = 0; i < obs.size(); ++i) {
            obs.get(i).update();
        }
    }
}
