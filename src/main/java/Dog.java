
public abstract class Dog extends VirtualPet {
	
	
	
	public Dog(String name, String description, int hunger, int waste, int boredom, int thirst, int health,
			int happiness) {
		super(name, description, hunger, waste, boredom, thirst, health, happiness);
	}
	
	public void walk() {
		hunger+=10;
		thirst+=10;
		boredom-=10;
		waste-=10;
	}

	

	

}
