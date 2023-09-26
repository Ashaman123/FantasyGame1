import java.util.Random;

public class randomEvents {
    public static void main(String[] args) {
        // Array of enemy subclasses
        Class<? extends Enemy>[] enemyTypes = new Class[]{
            Goblin.class,
            Orc.class,
            Witch.class,
            Bandit.class,
        };

        // Generate a random index to select an enemy subclass
        Random random = new Random();
        int randomIndex = random.nextInt(enemyTypes.length);

        // Create an instance of the randomly selected enemy subclass
        String enemyName = "RandomEnemy"; // You can customize the enemy name
        Enemy randomEnemy = createEnemy(enemyTypes[randomIndex], enemyName);

        // Display the selected enemy subclass
        System.out.println("A wild " + randomEnemy.name + " appears!");
        randomEnemy.attack();
    }

    // Create an instance of an enemy subclass
    public static Enemy createEnemy(Class<? extends Enemy> enemyClass, String name) {
        try {
            return enemyClass.getDeclaredConstructor(String.class).newInstance(name);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
