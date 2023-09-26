import java.util.List;
import java.util.ArrayList;

public class Character {
    private String name;
    private int level;
    private int maxHp;
    private int hp;
    private int attackDamage;
    private int defense;
    private int experience;
    private int maxExperience;
    private List<String> inventory;

    public Character(String name) {
        this.name = name;
        this.level = 1;
        this.maxHp = 100;
        this.hp = 100;
        this.attackDamage = 10;
        this.defense = 10;
        this.experience = 0;
        this.maxExperience = 100;
        this.inventory = new ArrayList<>();
    }

    public void levelUp() {
        if (experience >= maxExperience) {
            level++;
            maxExperience *= 1.5;
            maxHp += 10;
            hp = maxHp;
            attackDamage += 5;
            defense += 5;
            System.out.println(name + " has leveled up to level " + level + "!");
        }
    }

    public void heal() {
        // Implement healing logic here
    }

    public void attack(Character enemy) {
        // Implement attack logic here
    }

    public void addExperience(int amount) {
        experience += amount;
        levelUp();
    }

    public void addItem(String item) {
        inventory.add(item);
    }

    public void removeItem(String item) {
        inventory.remove(item);
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getHp() {
        return hp;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public int getArmor() {
        return defense;
    }

    public int getExperience() {
        return experience;
    }

    public int getMaxExperience() {
        return maxExperience;
    }

    public List<String> getInventory() {
        return inventory;
    }

}
