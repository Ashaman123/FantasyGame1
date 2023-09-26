import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mage extends Character {
    private List<String> spellbook;

    
    public Mage(String name) {
    	super(name);
        spellbook = new ArrayList<>();
    }

    public void smite(Character enemy) {
        // Implement smite ability to deal damage to an enemy
    }

    public void addSpell(String spell) {
        spellbook.add(spell);
    }

    public void useSpell(String spell, Character target) {
        // Implement logic for using a spell on a target
    }

    // Additional Mage-specific methods or attributes
}
