import java.util.Random;

public class Enemy {
	private Random random = new Random();

	private int level; 
	private double maxHp;
	private double hp;
	private double attackDamage;
	private int armor;
	private int experienceGiven;
	
	public Enemy() {
			this.experienceGiven = 15;
	        this.level = 1;
	        this.maxHp = 100;
	        this.hp = 100;
	        this.attackDamage = 10;
	        this.armor = 5;
	}
	 

	public void takeDamage(double damageDealt) {
	    double damageBlocked = Math.max(0, armor);
	    this.hp -= damageDealt - damageBlocked;
	    
	    if (this.hp < 0) {
	        this.hp = 0;
	        enemyDefeated();
	    }
	}


	public void enemyDefeated() {
		int killCount = 0; killCount++;
		int amount = this.experienceGiven;
		//Character.addExperience(amount);
	}
	
}

