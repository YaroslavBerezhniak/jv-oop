package core.basesyntax;

import classes.Bulldozer;
import classes.Excavator;
import classes.Machine;
import classes.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine []machines = {new Truck(), new Bulldozer(), new Excavator()};

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
            System.out.println();
        }
    }
}
