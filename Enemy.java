import java.util.Random;

public class Enemy {
	private Random random = new Random();

	private int level; 
	private int maxHp;
	private int hp;
	private int attackDamage;
	private int defense;
	
	
	public Enemy() {
	        this.level = 1;
	        this.maxHp = 100;
	        this.hp = 100;
	        this.attackDamage = 10;
	        this.defense = 10;
	}
	 

}

