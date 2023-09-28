import java.util.List;

public class Enemy {
    private String name;
    private double health;
    private double attackDamage;
	private double hp;
	private double maxHp;
	private double armor;
	private double minHp;
	private int attackCount;
	private int hitCount;
    // Constructors
  

    public void newEnemy() {
    	 setName("Goblin");
   	 	 setMaxHp(100.0);
    	 setHp(getMaxHp());
    	 setArmor(15);;
    	 setMinHp(0.0);
    	 setAttackCount(0);
     	 setHitCount(0);
     	 
    }
    // Getter and Setter methods
    public void setHitCount(int hitCount) {
		this.hitCount += hitCount;
	}
	
	public void setAttackCount(int attackCount) {
		this.attackCount += attackCount;
	}

	public int getHitCount() {
		return hitCount;
	}

	public int getAttackCount() {
		return attackCount;
	}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArmor(int i) {
    	this.armor = armor;
    	
    }
    public double getHp() {
		return hp;
	}


	


	public void setHp(double hp) {
		this.hp = hp;
	}





	public double getMaxHp() {
		return maxHp;
	}





	public void setMaxHp(double maxHp) {
		this.maxHp = maxHp;
	}

	public double getMinHp() {
		return minHp;
	}

	public void setMinHp(Double minHp) {
		this.minHp = minHp;
	}


    

    public double getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(double attackDamage) {
        this.attackDamage = attackDamage;
    }

    // Methods for enemy actions
    public void takeDamage(double damage) {
        if (damage > 0) {
            health -= damage;
            if (health < 0) {
                health = 0;
            }
        }
    }

    public void attack(Character character) {
        double damageDealt = attackDamage;
        System.out.println(name + " attacks " + character.getName() + " for " + damageDealt + " damage.");
        character.takeDamage(damageDealt);
    }
    public void displayEnemyInfo() {
        System.out.println("Enemy Name: " + getName());
        System.out.println("Health: " + getMaxHp());
        //System.out.println("Attack Damage: " + );
    }
}
