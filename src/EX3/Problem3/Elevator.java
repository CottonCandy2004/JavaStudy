package EX3.Problem3;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Elevator {
    private final IntegerProperty currentFloor = new SimpleIntegerProperty(1);
    private final int MAX_FLOOR = 2;
    private final int MIN_FLOOR = 1;
    
    public Elevator() {
        currentFloor.set(1);
    }
    
    public int getCurrentFloor() {
        return currentFloor.get();
    }
    
    public IntegerProperty currentFloorProperty() {
        return currentFloor;
    }
    
    public void moveUp() {
        if (currentFloor.get() < MAX_FLOOR) {
            currentFloor.set(currentFloor.get() + 1);
        }
    }
    
    public void moveDown() {
        if (currentFloor.get() > MIN_FLOOR) {
            currentFloor.set(currentFloor.get() - 1);
        }
    }
}
