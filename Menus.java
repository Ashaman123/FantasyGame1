
public class Menus {

	
	    // Other methods and fields in the Menus class

	    public void deathScreen(Character character) {
	        System.out.println("*************************");
	        System.out.println("*       Death Screen     *");
	        System.out.println("*************************");
	        System.out.println();

	        System.out.println("Oh no, " + character.getName() + " has perished!");
	        System.out.println("You have reached level " + character.getLevel());
	        System.out.println("Total experience gained: " + character.getExperience());
	        System.out.println("Thank you for playing!");

	        // You can add more details or options for the player here
	    }


	    
	    // Other methods in the Menus class
}

	

