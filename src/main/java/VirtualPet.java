
public abstract class VirtualPet {

	// instance data
	protected String name;
	protected String description;
	protected int play;
	protected int health;
	protected int happiness;

	// constructor
	public VirtualPet(String name, String description, int play, int health, int happiness) {
		this.name = name;
		this.description = description;
		this.play = play;
		this.health = health;
		this.happiness = happiness;
	}

	// Accessor method (getter)
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getPlay() {
		return play;
	}

	public int getHealth() {
		return health;
	}

	public int getHappiness() {
		return happiness;
	}

	public void playWithAPet() {
		happiness += 5;
		health += 6;
		play -= 5;
	}

	public void tick() {
		happiness += 5;
		health += 5;
	}

	@Override
	public String toString() {
		return name + "\t" + description + " \t" + play + " \t" + health + "\t" + happiness;
	}

}
