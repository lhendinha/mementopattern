import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<Life.Memento> savedTimes = new ArrayList<Life.Memento>();
        Life life = new Life();

        life.set("100 B.C.");
        savedTimes.add(life.saveToMemento());
        life.set("1500 A.D.");
        savedTimes.add(life.saveToMemento());
        life.set("2021 A.D.");
        savedTimes.add(life.saveToMemento());
        life.set("2048 A.D.");

        life.restoreFromMemento(savedTimes.get(1));
    }
}
