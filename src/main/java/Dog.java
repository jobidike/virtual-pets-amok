
public abstract class Dog extends VirtualPet {

	public Dog(String name, String description, int play, int health, int happiness) {
		super(name, description, play, health, happiness);
	}

	public void walkAllDogs() { // dont need a walk instance variable
		happiness += 10;
		health += 8;
		play += 5;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
