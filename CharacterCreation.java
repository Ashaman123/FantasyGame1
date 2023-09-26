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
		System.out.println("You are about to embaark on an amazong journey!");
		ClassSelection();
	}
	
	public static void ClassSelection() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please Select Your Class");
		System.out.println("");
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
				//Mage.Creator();
			}
			else if(CharacterChoice == 2) {
				//Paladin.Creator();
			}
			else if(CharacterChoice == 3) {
				//Ranger.Creator();
			}
			else if(CharacterChoice == 4) {
				//Thief.Creator();
			}
			else {
				//Bard.Creator();
			}
	}

	






}



