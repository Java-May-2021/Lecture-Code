
public class Animal {
	private String name;
	private String speicies;
	private int strength;
	private int health;
	
	public Animal(String name, String speicies, int strength, int health) {
		this.name = name;
		this.speicies = speicies;
		this.strength = strength;
		this.health = health;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpeicies() {
		return speicies;
	}

	public void setSpeicies(String speicies) {
		this.speicies = speicies;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	public String sayHello() {
		return "Hello!";
	}
	
	
}
