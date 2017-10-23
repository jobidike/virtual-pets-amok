
public class OrganicCat extends VirtualPet implements Organic {

	protected int hunger;
	protected int thirst;
	protected int litterWaste;

	public OrganicCat(String name, String description, int play, int health, int happiness, int hunger, int thirst,
			int litterWaste) {
		super(name, description, play, health, happiness);
		this.hunger = hunger;
		this.thirst = thirst;
		this.litterWaste = litterWaste;
	}

	public int getLitterWaste() {
		return litterWaste;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	@Override
	public void feedOrganicPets() {
		hunger -= 3;
		thirst += 3;
		litterWaste += 5;

	}

	@Override
	public void waterOrganicPets() {
		thirst -= 5;
		hunger += 2;

	}

	@Override
	public void tick() {
		happiness += 5;
		health += 5;
		litterWaste -= 10;
	}

	@Override
	public String toString() {
		return super.toString() + "\t" + hunger + "\t" + thirst + "\t" + litterWaste;

	}

}
