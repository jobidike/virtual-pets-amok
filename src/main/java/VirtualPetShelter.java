import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter { // maintenance class

	// protected int litterBoxWaste;

	private Map<String, VirtualPet> pets = new HashMap<String, VirtualPet>();

	protected int litterBoxLevel;

	public Collection<VirtualPet> allPets() {
		return pets.values();
	}

	public void emptyLitterBoxWaste() {
		litterBoxLevel = 0;

		for (VirtualPet currentCat : pets.values()) {
			if (currentCat instanceof OrganicCat) {
				litterBoxLevel += 5;
			}
		}
	}

	public int getLitterBoxLevel() {
		return litterBoxLevel;
	}

	public VirtualPet getOnePet(String name) {
		return pets.get(name);
	}

	public int getSize() {
		return pets.size();
	}

	public void addPet(VirtualPet newPet) {
		pets.put(newPet.getName(), newPet);
	}

	public VirtualPet adoptPet(String name) {
		return pets.remove(name);
	}

	public void waterOrganicPets() {
		for (VirtualPet current : pets.values()) {
			if (current instanceof Organic) {
				((Organic) current).waterOrganicPets();
			}
		}

	}

	public void feedOrganicPets() {
		for (VirtualPet current : pets.values()) {
			if (current instanceof Organic) {
				((Organic) current).feedOrganicPets();

			}
		}
	}

	public void oilRoboPets() {
		for (VirtualPet current : pets.values()) {
			if (current instanceof Robot) {
				((Robot) current).oilRoboPets();
			}
		}
	}

	public void cleanDogCages() {
		for (VirtualPet current : pets.values()) {
			if (current instanceof OrganicDog) {
				((OrganicDog) current).cleanDogCages();

			}

		}
	}

	public void walkAllDogs() {
		for (VirtualPet current : pets.values()) {
			if (current instanceof Dog)
				((Dog) current).walkAllDogs();
		}
	}

	public void playWithAPet() {
		for (VirtualPet onePet : allPets()) {
			onePet.playWithAPet();
		}
	}

	public void tickAll() {
		for (VirtualPet current : pets.values()) {
			if (current instanceof OrganicCat)
				((OrganicCat) current).tick();
		}
		for (VirtualPet current : pets.values()) {
			if (current instanceof OrganicDog)
				((OrganicDog) current).tick();
		}
	}

}
