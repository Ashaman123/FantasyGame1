import java.util.Scanner;

public class CharacterCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WelcomeScreen();
	}
	
	public static void WelcomeScreen() {
		System.out.println("***********************************");
		System.out.println("Welcome to FantasyGame1!");
		System.out.println("***********************************");
		System.out.println("You are about to begin an amazing journey!");
		ClassSelection();
	}
	
	public static void ClassSelection() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please Select Your Class (1-5)");
		System.out.println("*********************************");
		System.out.println("1. Mage");
		System.out.println("2. Paladin");
		System.out.println("3. Ranger");
		System.out.println("4. Thief");
		System.out.println("5. Bard");
		int CharacterChoice = scanner.nextInt();
		while(CharacterChoice < 0 || CharacterChoice > 6) {
			System.out.println("Please select a valid option");
			CharacterChoice = scanner.nextInt();
		}
			if(CharacterChoice == 1) {
				String name = scanner.nextLine();
				System.out.println("Please enter your name adventurer! ");
				name = scanner.nextLine();
				System.out.println("Your name is " + name + "?");
				System.out.println("[Y] or [N]");
				char choice = scanner.nextLine().toUpperCase().charAt(0);
					while(choice == ('N')) {
						System.out.println("Oh! I must have misheard you! What is your name adventurer? ");
						name = scanner.nextLine();
						System.out.println("Your name is " + name + "?");
						System.out.println("[Y] or [N]");
						choice = scanner.nextLine().toUpperCase().charAt(0);
					}
				Mage mage = new Mage(name);
				System.out.println("Well then " + name + "...let me tell you a story!");
			    GameSaverManager.saveFileName = name;
			    	MainGame.GameStart();
			}
			else if(CharacterChoice == 2) {
				String name = scanner.nextLine();
				System.out.println("Please enter your name adventurer! ");
				name = scanner.nextLine();
				System.out.println("Your name is " + name + "?");
				System.out.println("[Y] or [N]");
				char choice = scanner.nextLine().toUpperCase().charAt(0);
					while(choice == ('N')) {
						System.out.println("Oh! I must have misheard you! What is your name adventurer? ");
						name = scanner.nextLine();
						System.out.println("Your name is " + name + "?");
						System.out.println("[Y] or [N]");
						choice = scanner.nextLine().toUpperCase().charAt(0);
					}
				Paladin paladin = new Paladin(name);
				System.out.println("Well then " + name + "...let me tell you a story!");
			    GameSaverManager.saveFileName = name;
		    	MainGame.GameStart();

			}
			else if(CharacterChoice == 3) {
				String name = scanner.nextLine();
				System.out.println("Please enter your name adventurer! ");
				name = scanner.nextLine();
				System.out.println("Your name is " + name + "?");
				System.out.println("[Y] or [N]");
				char choice = scanner.nextLine().toUpperCase().charAt(0);
					while(choice == ('N')) {
						System.out.println("Oh! I must have misheard you! What is your name adventurer? ");
						name = scanner.nextLine();
						System.out.println("Your name is " + name + "?");
						System.out.println("[Y] or [N]");
						choice = scanner.nextLine().toUpperCase().charAt(0);
					}
					Ranger ranger = new Ranger(name);
					System.out.println("Well then " + name + "...let me tell you a story!");
				    GameSaverManager.saveFileName = name;
			    	MainGame.GameStart();

			}
			else if(CharacterChoice == 4) {
				String name = scanner.nextLine();
				System.out.println("Please enter your name adventurer! ");
				name = scanner.nextLine();
				System.out.println("Your name is " + name + "?");
				System.out.println("[Y] or [N]");
				char choice = scanner.nextLine().toUpperCase().charAt(0);
					while(choice == ('N')) {
						System.out.println("Oh! I must have misheard you! What is your name adventurer? ");
						name = scanner.nextLine();
						System.out.println("Your name is " + name + "?");
						System.out.println("[Y] or [N]");
						choice = scanner.nextLine().toUpperCase().charAt(0);
					}
				Thief thief = new Thief(name);
				System.out.println("Well then " + name + "...let me tell you a story!");
			    GameSaverManager.saveFileName = name;
		    	MainGame.GameStart();

			}
			else {
				String name = scanner.nextLine();
				System.out.println("Please enter your name adventurer! ");
				name = scanner.nextLine();
				System.out.println("Your name is " + name + "?");
				System.out.println("[Y] or [N]");
				char choice = scanner.nextLine().toUpperCase().charAt(0);
					while(choice == ('N')) {
						System.out.println("Oh! I must have misheard you! What is your name adventurer? ");
						name = scanner.nextLine();
						System.out.println("Your name is " + name + "?");
						System.out.println("[Y] or [N]");
						choice = scanner.nextLine().toUpperCase().charAt(0);
					}
				Bard bard = new Bard(name);
				System.out.println("Well then " + name + "...let me tell you a story!");
			    GameSaverManager.saveFileName = name;
		    	MainGame.GameStart();

			}
	}

	






}



