
public class GameEngine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character character = new Character();
		Enemy enemy = new Enemy();
		
    	character.newCharacter();        
    	character.displayCharacterInfo();
    	
    	while(character.getHp() > character.getMinHp()) {
    		if(character.getHp() <= character.getMinHp() ) {
    			Menus menu = new Menus();
    			menu.deathScreen(character);
    		}
    		else if (enemy == null){
    			enemy.newEnemy();
    			enemy.displayEnemyInfo();
    			System.out.println("This is your next oponent");
    		}
    		else {
    			if(enemy.getAttackCount() < character.getAttackCount()) {
    					enemy.attack(character);
    					System.out.println(enemy.getName() + " attacks " + character.getName());
    					character.takeDamage1(10.0);
    					System.out.println(character.getName() + ": " +character.getHp() + " HP");
    				}
    				else if(character.getAttackCount() < enemy.getAttackCount()) {
    					character.attackEnemy(enemy);
    					System.out.println(character.getName() + "attacks " + enemy.getName());
    					enemy.takeDamage(15.0);
    					System.out.println(enemy.getName() + ": " +enemy.getHp() + " HP");

    				}
    				
    				}
    	}
    	
	
	
	
	
	}

}
