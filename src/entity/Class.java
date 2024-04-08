package entity;

public class Class extends Entity {

    public static Class warrior() {
        Class c = new Class();
        c.strength = 3;
        c.name = "warrior";
        return new Class();
    }

    public static Class mage() {
        Class c = new Class();
        c.intelligence = 3;
        c.name = "mage";
        return new Class();
    }

    public static Class ranger() {
        Class c = new Class();
        c.dexterity = 3;
        c.name = "ranger";
        return new Class();
    }
}
