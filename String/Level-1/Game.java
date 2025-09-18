// Base Class
class Character {
    String name;
    int health;

    Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    void attack() {
        System.out.println(name + " attacks with bare hands!");
    }
}

// Subclass Warrior
class Warrior extends Character {
    Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    void attack() {
        System.out.println(name + " swings a sword!");
    }
}

// Subclass Mage
class Mage extends Character {
    Mage(String name, int health) {
        super(name, health);
    }

    @Override
    void attack() {
        System.out.println(name + " attacks with magic!");
    }

    void castSpell() {
        System.out.println(name + " casts a powerful spell!");
    }
}

// Subclass Archer
class Archer extends Character {
    Archer(String name, int health) {
        super(name, health);
    }

    @Override
    void attack() {
        System.out.println(name + " shoots an arrow!");
    }
}

// Main Class
public class Game {
    public static void main(String[] args) {
        Character w = new Warrior("Thor", 100);
        Character m = new Mage("Merlin", 80);
        Character a = new Archer("Robin", 90);

        w.attack();
        m.attack();
        a.attack();

        // Extra Mage ability
        if (m instanceof Mage) {
            ((Mage) m).castSpell();
        }
    }
}
