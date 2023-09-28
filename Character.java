import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;

public class Character {
	private String name;
	private double hp;
	private double maxHp;
	private double experience;
	private double maxExperience;
	private double armor;
	private int level;
	private List<InventoryItem> inventory;
	private int amount;
	private double minHp;
	
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


public void newCharacter() {
	 Scanner input = new Scanner(System.in);
	 System.out.println("Please Enter Your Character Name: ");
	 setName(input.nextLine());
 	 setHp(100.0);
     setMaxHp(200.0);
 	 setExperience(0.0);
 	 setMaxExperience(200.0);
 	 setArmor(15);;
 	 setLevel(0);
 	 setAmount(0);
 	 setMinHp(0.0);
}


	public String getName() {
		return name;
	}





	public void setName(String name) {
		
		this.name = name;
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


	public double getExperience() {
		return experience;
	}




	

	    public void setExperience(double experience) {
	        this.experience = experience;
	    }

	    public double getMaxExperience() {
	        return maxExperience;
	    }

	    public void addExperience(double amount) {
	        // Assuming you want to increment experience by the specified amount
	        this.experience += experience;
	    }

	    public void setMaxExperience(double maxExperience) {
	        this.maxExperience = maxExperience;
	    }

	    public void setAmount(double amount) {
	        this.amount = (int) amount;
	    }


	    public double getAmount() {
	        Randomizer randomizer = new Randomizer();
	        amount = (int) randomizer.getRandomDouble(10.0, 51.0);
	        return amount;
	    }

	


	public double getArmor() {
		return armor;
	}



	public void setArmor(double armor) {
		this.armor = armor;
	}





	public int getLevel() {
		return level;
	}





	public void setLevel(int level) {
		this.level = level;
	}
	
	public void levelUp() {
	    if (this.experience >= this.maxExperience) {
	        Randomizer randomizer = new Randomizer();
	        this.level += 1; // Use += to increment the level
	        setExperience(0.0);
	        maxExperience = this.maxExperience * 1.33;
	        //this.hp = hp + Math.round((randomizer.getRandomDouble(1.5) * 1.5) * 100.0) / 100.0;
	        maxHp = this.maxHp * 2; hp = maxHp;
	        System.out.println("");
	        System.out.println("Lvl: " + level);
	        System.out.println("EXP: " + experience + "/" + maxExperience);
	        System.out.println("HP: " + hp + "/" + maxHp);
	        System.out.println("");


	    }
	}

public void takeDamage(double damage) {
	
}

public void heal(double amount) {
	
}

public void addToInventory(InventoryItem item) {
	
}

public void removeFromInventory(InventoryItem item) {
	
}

public void useItem(InventoryItem item) {
	
}

public void attack(Character target) {
	
}

public void isAlive() {
	
}

public void displayCharacterInfo() {
	    System.out.println("Name: " + name);
	    System.out.println("Level: " + level);
	    System.out.println("HP: " + hp + "/" + maxHp);
	    System.out.println("Experience: " + experience + "/" + maxExperience);
	    System.out.println("Armor: " + armor);
	    System.out.println("Inventory: " + inventory);
	    
	}

}



/*
	public List<Skill> getSkills() {
		return skills;
	}





	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}
*/

