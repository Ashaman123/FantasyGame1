import java.util.List;
import java.util.ArrayList;

public class Character {
    private String name;
    private int level;
    private double maxHp;
    private double hp;
    private double attackDamage;
    private double armor;
    private double experience;
    private double maxExperience;
    private List<String> inventory;
    private double accuracy;
    
    
    public Character(String name) {
        this.name = name;
        this.level = 1;
        this.maxHp = 100.00;
        this.hp = 100.00;
        this.attackDamage = 10.00;
        this.armor = 10.00;
        this.experience = 0.00;
        this.maxExperience = 100.00;
        this.accuracy = 100.00;
        
        
        this.inventory = new ArrayList<>();
    }

    public void levelUp() {
        if (experience >= maxExperience) {
            level++;
            maxExperience *= 1.5;
            maxHp += 10.0;
            hp = maxHp;
            attackDamage += 5.0;
            armor += 5.0;
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

    public double getMaxHp() {
        return maxHp;
    }

    public double getHp() {
        return hp;
    }

    public double getAttackDamage() {
        return attackDamage;
    }

    public double getArmor() {
        return armor;
    }

    public double getExperience() {
        return experience;
    }

    public double getMaxExperience() {
        return maxExperience;
    }
    public double getAccuracy() {
        return accuracy;
    }
    public List<String> getInventory() {
        return inventory;
    }

}
