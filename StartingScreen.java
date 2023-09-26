import java.util.Scanner;


public class StartingScreen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("--------------------------------------------");
		System.out.println("	  WELCOME TO FANTASYGAME1");
		System.out.println("--------------------------------------------");
		System.out.println("Please Enter the Number of your Next Action!");
		System.out.println("--------------------------------------------");
		System.out.println("1. New Game");
		System.out.println("2. Load Game");
		System.out.println("3. Quit Game");
			int choice = scanner.nextInt();
				if(choice == 1) {
					NewGame();
				}
				else if(choice == 2) {
					LoadMenu();
				}
				if(choice == 3) {
					QuitGame();
				}	
				else {
					while(choice < 0 && choice > 3) {
						System.out.println("Invalid Cjoice. Please Try Again!");
						choice = scanner.nextInt();
					}
				}
}
						public static void NewGame() {
							System.out.println("Start New Game");
							CharacterCreation.WelcomeScreen();   
						
						}
						public static void LoadMenu() {
					        System.out.println("Load Existing Game");
					        //GameSaverManager.loadGameState();
					    }
						public static void QuitGame() {
					        System.out.println("Have a good day!");
					        System.out.println("Quiting...!");
					        System.exit(5);
					    }

	
	
}
