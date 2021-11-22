import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MementoTest {
    List<Life.Memento> savedTimes = new ArrayList<Life.Memento>();
    Life life = null;

    @BeforeEach
    void setUp() {
        life = new Life();
    }

    @Test
    void getLastMemento() {
        System.out.println("Running: getLastMemento");

        life.set("100 B.C.");
        savedTimes.add(life.saveToMemento());
        life.set("1500 A.D.");
        savedTimes.add(life.saveToMemento());
        life.set("2021 A.D.");
        savedTimes.add(life.saveToMemento());
        life.set("2048 A.D.");
        savedTimes.add(life.saveToMemento());

        assertEquals(life.getFromMemento(savedTimes.get(3)), "2048 A.D.");
    }

    @Test
    void getFirstMemento() {
        System.out.println("Running: getFirstMemento");

        life.set("100 B.C.");
        savedTimes.add(life.saveToMemento());
        life.set("1500 A.D.");
        savedTimes.add(life.saveToMemento());
        life.set("2021 A.D.");
        savedTimes.add(life.saveToMemento());
        life.set("2048 A.D.");
        savedTimes.add(life.saveToMemento());

        assertEquals(life.getFromMemento(savedTimes.get(0)), "100 B.C.");
    }

    @Test
    void getMiddleMemento() {
        System.out.println("Running: getMiddleMemento");

        life.set("100 B.C.");
        savedTimes.add(life.saveToMemento());
        life.set("1500 A.D.");
        savedTimes.add(life.saveToMemento());
        life.set("2021 A.D.");
        savedTimes.add(life.saveToMemento());
        life.set("2048 A.D.");
        savedTimes.add(life.saveToMemento());
        life.set("2092 A.D.");
        savedTimes.add(life.saveToMemento());

        assertEquals(life.getFromMemento(savedTimes.get(2)), "2021 A.D.");
    }
}
