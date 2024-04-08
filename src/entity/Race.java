package entity;

public class Race extends Entity {

    public static Race human() {
        Race r = new Race();
        r.strength = 1.03;
        r.intelligence = 1.03;
        r.dexterity = 1.04;
        r.name = "human";
        return new Race();
    }

    public static Race elf() {
        Race r = new Race();
        r.intelligence = 1.06;
        r.dexterity = 1.04;
        r.name = "elf";
        return new Race();
    }

    public static Race dwarf() {
        Race r = new Race();
        r.strength = 1.07;
        r.resistance = 1.03;
        r.name = "dwarf";
        return new Race();
    }

    public static Race troll() {
        Race r = new Race();
        r.strength = 1.1;
        r.name = "troll";
        return new Race();
    }

    public static Race darkElf() {
        Race r = new Race();
        r.intelligence = 1.04;
        r.dexterity = 1.06;
        r.name = "dark elf";
        return new Race();
    }

    public static Race undead() {
        Race r = new Race();
        r.intelligence = 1.1;
        r.name = "undead";
        return new Race();
    }
}
