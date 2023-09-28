
import static org.junit.Assert.*;
import org.junit.Test;

public class CharacterTest {

    @Test
    public void testLevelUp() {
        // Create a Character instance
        Character character = new Character();
        
        // Set initial values for testing
        character.setLevel(1);
        character.setExperience(0.0);
        character.setMaxExperience(200.0); 
        character.setHp(100.0);
        character.setName("Owen");
        
        System.out.println("Character: " + character.getName());
        System.out.println("Lvl: " + character.getLevel());
        System.out.println("EXP: " + character.getExperience() + "/" + character.getMaxExperience());
        
        
        for (int i = 0; i < 10; i++) {
            if (character.getExperience() >= character.getMaxExperience()) { // Corrected condition
                character.levelUp();
                System.out.println("");
            } else {
                double amount = character.getAmount();
                System.out.println(character.getName() + " slayed a monster! He gets " + amount + " EXP");
                character.addExperience(amount);
                System.out.println("EXP: " + character.getExperience() + "/" + character.getMaxExperience());
                //character.setAmount(50.0);
            }
        }

     
    }
}
