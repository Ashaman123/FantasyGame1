import java.io.*;

public class GameSaverManager {
    public static String saveFileName; // Static variable to store the save file name

    // Other methods...

    public static void saveGameState(GameState gameState) {
        String fileName = saveFileName + "_Save.dat"; // Modify the file name based on the character's name
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            System.out.println("Saving game data...");
            outputStream.writeObject(gameState);
            System.out.println("Game data saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static GameState loadGameState() {
        String fileName = saveFileName + "_Save.dat"; // Modify the file name based on the character's name
        GameState gameState = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            System.out.println("Loading game data...");
            gameState = (GameState) inputStream.readObject();
            System.out.println("Game data loaded successfully.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return gameState;
    }

    public static boolean doesSaveFileExist() {
        String fileName = saveFileName + "_Save.dat"; // Modify the file name based on the character's name
        File saveFile = new File(fileName);
        return saveFile.exists();
    }
}
