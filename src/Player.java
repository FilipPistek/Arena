import java.util.Scanner;

public class Player {

    protected String name;
    protected int level = 1;
    protected int statPoint = 5;
    protected double strenght = 0;
    protected double intelligence = 0;
    protected double agility = 0;
    protected int exp = 0;

    public void addLevel() {
        if (exp == level * 100) {
            addLevel();
            exp = 0;
        }
    }

    public void healthPoints() {
       int hp = level * 10;
    }

    public void addStatPoint() {
        while (statPoint != 0) {

        }
    }
}
