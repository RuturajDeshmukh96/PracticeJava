package Poly;

// १. मॉन्स्टर क्लास (स्वतंत्र)
class Monster {
    String name;
    int health;

    public Monster(String name, int health) {
        this.name = name;
        this.health = health;
        System.out.println("Spawned a monster: " + this.name);
    }
}

// २. ड्रॅगन क्लास (हा सुद्धा स्वतंत्र, जो मॉन्स्टरकडून गुण घेतो)
class Dragon extends Monster {
    int firePower;

    public Dragon(String name, int health, int firePower) {
        super(name, health);
        this.firePower = firePower;
        System.out.println("Wait... " + this.name + " is a Boss! It has " + this.firePower + " fire power!");
    }
}

// ३. आपला मुख्य गेम क्लास (ज्याच्यात main method आहे)
public class Game {
    public static void main(String[] args) {
        System.out.println("--- LEVEL 1 START ---");

        Monster normalEnemy = new Monster("Swamp Goblin", 50);
        Game myGame = new Game();
        myGame.level(normalEnemy, 1);

        Dragon boss = new Dragon("Eden Dragon", 10000, 500);
        myGame.lev(boss, 100);
    }

    public void level(Monster m, int level) {
        System.out.println("its an " + level + " level Enemy");
    }

    public void lev(Dragon d, int level) {
        System.out.println("its an " + level + " level Enemy");
    }
}