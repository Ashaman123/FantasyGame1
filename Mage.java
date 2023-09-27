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
       

        // Outline for Mage spell methods:

        // 1. Fireball Spell
        public void castFireballSpell() {
            // Implement the Fireball spell effect here
            // This method could deal damage to the target or have other effects
        }

        // 2. Frost Nova Spell
        public void castFrostNovaSpell() {
            // Implement the Frost Nova spell effect here
            // This method could freeze or slow down enemies in an area
        }

        // 3. Lightning Bolt Spell
        public void castLightningBoltSpell() {
            // Implement the Lightning Bolt spell effect here
            // This method could deal high damage to a single target
        }

        // 4. Arcane Shield Spell
        public void castArcaneShieldSpell() {
            // Implement the Arcane Shield spell effect here
            // This method could provide the character with temporary defense
        }

        // 5. Teleportation Spell
        public void castTeleportationSpell() {
            // Implement the Teleportation spell effect here
            // This method could allow the character to teleport to a different location
        }
    }

    // Additional Mage-specific methods or attributes

