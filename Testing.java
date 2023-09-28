import static org.junit.Assert.*;
import org.junit.Test;

public class Testing {

    @Test
    public void testLevelUp() {
        // Create a Character instance
        Character character = new Character();
        
        // Set initial values for testing
        character.setLevel(1);
        character.setExperience(100); // Some initial experience
        character.setMaxExperience(200); // Set max experience
        character.setHp(100); // Set initial HP
        
        // Call the levelUp method
        character.levelUp(2); // Assuming you want to level up to level 3
        
        // Assert that the character's level has increased
        assertEquals(3, character.getLevel());
        
        // Assert that the character's experience has been reset to 0
        assertEquals(0, character.getExperience());
        
        // Assert that the character's max experience has increased (e.g., doubled)
        assertEquals(400, character.getMaxExperience());
        
        // Assert that the character's HP has been modified according to your logic
        // You can add more assertions based on your levelUp logic
        assertTrue(character.getHp() > 100); // Assuming HP should increase
        
        // Add more assertions as needed based on your levelUp logic
    }
}
