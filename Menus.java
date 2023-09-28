import java.util.Scanner;


public class Menus {
	Scanner input = new Scanner(System.in);
	 public void startingScreen() {
	        System.out.println("*************************");
	        System.out.println("*     Welcome to Your   *");
	        System.out.println("*      Fantasy Game     *");
	        System.out.println("*************************");
	        System.out.println();
	        System.out.println("Choose an option:");
	        System.out.println("1. New Game");
	        System.out.println("2. Load Game");
	        System.out.println("3. Exit");
	        	int choice = input.nextInt();
	        	if(choice == 1) {
	        		GameEngine.main(null);
	        	}
	        	else if(choice == 2) {
	        		System.out.println("Get fucked for now m8");
	        	}
	        	else {
	        		System.exit(0);
	        	}
	        // You can add more options or instructions here
	    }
	    // Other methods and fields in the Menus class

	    public void deathScreen(Character character) {
	        System.out.println("*************************");
	        System.out.println("*       Death Screen     *");
	        System.out.println("*************************");
	        System.out.println();

	        System.out.println("Oh no,you have perished!");
	        System.out.println("You have reached level " + character.getLevel());
	        System.out.println("Total experience gained: " + character.getExperience());
	        System.out.println("Thank you for playing!");

	        // You can add more details or options for the player here
	    }


	    
	    // Other methods in the Menus class
}

	

