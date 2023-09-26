import java.util.Scanner;
import java.util.List;

public class MainGame {
    public static void main(String[] args) {
    	GameStart();
    }
    
    public static void GameStart() {
        Scanner scanner = new Scanner(System.in);
        int userHp = 0;
        int userLevel = 0;
		int userMaxHp = 0;
		int userAttackDamage = 0;
		int userArmor = 0;
		int userExperience = 0;
		int userMaxExperience = 0;
		List<String> userInventory;
		
        if(CharacterCreation.mage != null) {
    		Mage mage = CharacterCreation.mage;
    		 userHp = mage.getHp();
    		 userLevel = mage.getLevel();
    		 userMaxHp = mage.getMaxHp();
    		 userAttackDamage = mage.getAttackDamage();
    		 userArmor = mage.getArmor();
    		 userExperience = mage.getExperience();
    		 userMaxExperience = mage.getMaxExperience();
    		 userInventory = mage.getInventory();
    	}
    	else if(CharacterCreation.paladin != null) {
    		Paladin paladin = CharacterCreation.paladin;
    		 userHp = paladin.getHp();
    		 userLevel = paladin.getLevel();
    		 userMaxHp = paladin.getMaxHp();
    		 userAttackDamage = paladin.getAttackDamage();
    		 userArmor = paladin.getArmor();
    		 userExperience = paladin.getExperience();
    		 userMaxExperience = paladin.getMaxExperience();
    		 userInventory = paladin.getInventory(); 
    		
    	} else if (CharacterCreation.paladin != null){
    		Ranger ranger = CharacterCreation.ranger;
	         userHp = ranger.getHp();
	         userLevel = ranger.getLevel();
	         userMaxHp = ranger.getMaxHp();
	         userAttackDamage = ranger.getAttackDamage();
	         userArmor = ranger.getArmor();
	         userExperience = ranger.getExperience();
	         userMaxExperience = ranger.getMaxExperience();
	         userInventory = ranger.getInventory(); 
	        
    	} else if (CharacterCreation.thief != null){
    		Thief thief = CharacterCreation.thief;
	         userHp = thief.getHp();
	         userLevel = thief.getLevel();
	         userMaxHp = thief.getMaxHp();
	         userAttackDamage = thief.getAttackDamage();
	         userArmor = thief.getArmor();
	         userExperience = thief.getExperience();
	         userMaxExperience = thief.getMaxExperience();
	         userInventory = thief.getInventory();
	        
    	} else {
    		Bard bard = CharacterCreation.bard;
	         userHp = bard.getHp();
	         userLevel = bard.getLevel();
	         userMaxHp = bard.getMaxHp();
	         userAttackDamage = bard.getAttackDamage();
	         userArmor = bard.getArmor();
	         userExperience = bard.getExperience();
	         userMaxExperience = bard.getMaxExperience();
	         userInventory = bard.getInventory();
    	}
      
        System.out.println("Level: " + userLevel);
		System.out.println("HP: " + userHp + "/" + userMaxHp + " HP");
		System.out.println("Experience: " + userExperience + "/" + userMaxExperience + " XP");
		System.out.println("Armor: " + userArmor);
		System.out.println("Base Damage: " + userAttackDamage + " HP");
		System.out.println("");
		System.out.println("");

        System.out.println("You find yourself in a mysterious forest.");
        System.out.println("The forest is dense, and the path ahead is unclear.");
        System.out.println("You must make choices to navigate through this adventure.");
        System.out.println("Your decisions will determine your fate.");
        System.out.println("Are you ready to begin your journey?");
        System.out.print("[Y]es or [N]o: ");

        char choice = scanner.nextLine().charAt(0);

        if (choice == 'Y' || choice == 'y') {
            System.out.println("Great! Your adventure begins now.");
            // Start the game by calling the appropriate game method or class.
            // This is where you would initiate the main game loop.
            levelGenerator();
        } else {
            System.out.println("Perhaps another time. Goodbye!");
        }
    
    }
        public static void levelGenerator() {
        	
        		
        		
        		
        	
        	
        	
        	
        	
        		
        	   
        	       
        	
        	
        	}
        }
        
    

