
import static org.junit.Assert.*;
import org.junit.Test;

public class CharacterTest {

    @Test
    public void testLevelUp() {
        // Create a Character instance
        Character character = new Character();
        
        // Set initial values for testing
        character.setLevel(1);
        character.setExperience(100.0);
        character.setMaxExperience(200.0); 
        character.setHp(100.0);
        character.setName("Owen");
        
        System.out.println("Lvl: " + character.getLevel());
        System.out.println("EXP: " + character.getExperience());
        System.out.println("Max EXP: " + character.getMaxExperience());
        character.setAmount(50.0);
        
        
        for(int i = 0; i < 5; i++) {
        	character.addExperience(50.0);
        	
        	System.out.println("New EXP: " + character.getExperience() + "/" + character.getMaxExperience());
        	character.setAmount(50.0);
        }
        character.addExperience(50.0);
        System.out.println("Newer EXP: " + character.getExperience() + "/" + character.getMaxExperience());
        
        character.levelUp();
        
        System.out.println("New Level: " + character.getLevel());
        System.out.println("EXP: " + character.getExperience());
        System.out.println("Max EXP: " + character.getMaxExperience());
        System.out.println("New HP: " + character.getHp());
        
     
        assertTrue(character.getHp() > 100.0);  assertEquals(2, character.getLevel());
        
        assertEquals(0.0, character.getExperience()); assertEquals(400.0, character.getMaxExperience());
     
    }
}
