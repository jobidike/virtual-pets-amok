
public class OrganicDog extends Dog implements Organic {

	protected int hunger;
	protected int thirst;
	protected int cageWasteAmount;

	public OrganicDog(String name, String description, int play, int health, int happiness, int hunger, int thirst,
			int cageWasteAmount) {
		super(name, description, play, health, happiness);
		this.hunger = hunger;
		this.thirst = thirst;
		this.cageWasteAmount = cageWasteAmount;
	}

	public void cleanDogCages() {
		cageWasteAmount = 0;
	}

	public int getCageWasteAmount() {
		return cageWasteAmount;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	@Override
	public void tick() {
		happiness += 5;
		health += 5;
		cageWasteAmount += 10;
	}

	@Override
	public void feedOrganicPets() {
		hunger -= 3;
		thirst += 3;
		cageWasteAmount += 10;
	}

	@Override
	public void waterOrganicPets() {
		thirst -= 5;
		hunger += 2;

	}

	@Override
	public String toString() {
		return super.toString() + "\t" + hunger + "\t" + thirst + "\t" + cageWasteAmount;
	}

}
