
public class MainMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gotoMainMenu();
	}

	public static void gotoMainMenu() {
		        // Create or load a game state
		        GameState gameState = new GameState();
		        //gameState.setPlayerScore(100);
		        //gameState.setPlayerName("Player1");

		        // Save the game state
		        GameSaveManager.saveGameState(gameState, "save.dat");

		        // Load the game state
		        GameState loadedState = GameSaveManager.loadGameState("save.dat");
		        if (loadedState != null) {
		            System.out.println("Loaded player score: " + loadedState.getPlayerScore());
		            System.out.println("Loaded player name: " + loadedState.getPlayerName());
		        }
		    }
		}

	}
	
}
