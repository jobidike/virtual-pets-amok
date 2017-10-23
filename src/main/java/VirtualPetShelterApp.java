import java.util.Scanner;

public class VirtualPetShelterApp {

	static String selection;
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		VirtualPetShelter shelter = new VirtualPetShelter();

		OrganicDog snoopy = new OrganicDog("Snoopy ", "puppy dog", 65, 39, 45, 55, 78, 69);
		OrganicDog buddy = new OrganicDog("Buddy ", "hairy dog", 60, 53, 40, 65, 45, 73);
		RoboDog rusty = new RoboDog("Rusty ", "squeaky dog", 69, 49, 80, 70);
		RoboDog lenny = new RoboDog("Lenny ", "robot dog", 70, 60, 80, 55);
		OrganicCat garfi = new OrganicCat("Garfi ", "fat cat", 50, 55, 60, 75, 69, 50);
		OrganicCat gigi = new OrganicCat("Gigi ", "cute kitten", 60, 55, 65, 72, 62, 50);
		RoboCat copper = new RoboCat("Copper ", "robot cat", 45, 50, 55, 60);
		RoboCat squeak = new RoboCat("Squeak ", "squeaky cat", 39, 45, 64, 72);

		shelter.addPet(snoopy);
		shelter.addPet(buddy);
		shelter.addPet(rusty);
		shelter.addPet(lenny);
		shelter.addPet(garfi);
		shelter.addPet(gigi);
		shelter.addPet(copper);
		shelter.addPet(squeak);

		System.out.println("Welcome to the home of JJ's Virtual Pet shelter!");

		petStats(shelter);

		listOptions();
		int choice = input.nextInt();
		do {

			if (choice == 1) {
				shelter.feedOrganicPets();
				System.out.println("Oh, so you want to feed all the pets!\n" + "Thanks for feeding all the pets!\n");
				petStats(shelter);
				listOptions();
				choice = input.nextInt();
			} else if (choice == 2) {
				shelter.waterOrganicPets();
				System.out.println("Oh, so you want to water all the pets!\n" + "Thanks for watering all the pets!\n");
				petStats(shelter);
				listOptions();
				choice = input.nextInt();

			} else if (choice == 3) {
				shelter.playWithAPet();
				System.out.println("Oh, so you want to play with a pet!\n");
				for (VirtualPet current : shelter.allPets()) {
					System.out.println("" + current.getName() + "" + "" + current.getDescription() + "");
				}
				System.out.println("\nPlease enter the name of the pet you want to play with?");
				selection = input.next();
				System.out.println("Great, you can play with " + selection);
				petStats(shelter);
				listOptions();
				choice = input.nextInt();
			} else if (choice == 4) {
				shelter.walkAllDogs();
				System.out.println("You must be in great shape to walk all those dogs!!\n");
				petStats(shelter);
				listOptions();
				choice = input.nextInt();
			} else if (choice == 5) {
				shelter.cleanDogCages();
				System.out.println("We are so happy you chose to clean those smelly dog cages!!\n");
				shelter.tickAll();
				petStats(shelter);
				listOptions();
				choice = input.nextInt();
			} else if (choice == 6) {
				shelter.emptyLitterBoxWaste();
				System.out.println("Whew, we dodged that smelly litter box!");
				shelter.tickAll();
				petStats(shelter);
				listOptions();
				choice = input.nextInt();
			} else if (choice == 7) {
				shelter.oilRoboPets();
				System.out.println("Thanks, my ears were starting to hurt from all that squeaking.");
				petStats(shelter);
				listOptions();
				choice = input.nextInt();
			} else if (choice == 8) {
				System.out.println("Yay, you want to adopt a pet!");
				for (VirtualPet current : shelter.allPets()) {
					System.out.println("" + current.getName() + "" + "\t" + current.getDescription());
				}
				System.out.println("Please enter the name of the pet you want to adopt?");
				selection = input.next();
				shelter.adoptPet(selection);
				System.out.println("You will be a great fit for " + selection);
				petStats(shelter);
				listOptions();
				choice = input.nextInt();

			} else if (choice == 9) {
				String newPetName;
				String newPetDescription;
				System.out.println("So you want to admit a pet, can you tell me the name of your pet?");
				newPetName = input.next();
				System.out.println("Can you please give me a description of your pet?");
				newPetDescription = input.next();
				VirtualPet newPet = new RoboDog(newPetName, newPetDescription, 50, 50, 50, 50);
				shelter.addPet(newPet);
				for (VirtualPet current : shelter.allPets()) {
					System.out.println("" + current.getName() + "" + "\t" + current.getDescription());
				}
				System.out.println("Thanks for bringing your pet into the shelter, we will find your pet a safe home.");
				petStats(shelter);
				listOptions();
				choice = input.nextInt();

			} else if (choice > 10 || choice < 1) {
				System.out.println("I'm sorry but you entered invalid data");
				listOptions();
				input.next();
			}
		} while (choice != 10);
		System.out.println("Thanks for playing!");
	}

	public static void petStats(VirtualPetShelter shelter) {
		System.out.println("\nThis is the status of your pets:\n");
		System.out.println(
				"Name  |Description |Play    |Health |Happiness|Hunger  |Thirst|OilLevel/CageWaste/LitterWaste");
		System.out.println(
				"------|------------|--------|-------|---------|--------|------|------------------------------");

		for (VirtualPet currentOrganicCat : shelter.allPets()) {
			if (currentOrganicCat instanceof OrganicCat) {
				System.out.println(currentOrganicCat);
			}

		}
		for (VirtualPet currentOrganicDog : shelter.allPets()) {
			if (currentOrganicDog instanceof OrganicDog) {
				System.out.println(currentOrganicDog);
			}

		}
		for (VirtualPet currentRoboDog : shelter.allPets()) {
			if (currentRoboDog instanceof RoboDog) {
				System.out.println(currentRoboDog);
			}

		}
		for (VirtualPet currentRoboCat : shelter.allPets()) {
			if (currentRoboCat instanceof RoboCat) {
				System.out.println(currentRoboCat);
			}

		}

	}

	public static void listOptions() {
		System.out.println("\nWhat would you like to do next?\n");
		System.out.println("1 to feed the organic pets");
		System.out.println("2 to water the organic pets");
		System.out.println("3 to play with a pet");
		System.out.println("4 to walk all the dogs");
		System.out.println("5 to clean dog cages");
		System.out.println("6 to clean the shelter litterbox");
		System.out.println("7 to oil all robotic pets");
		System.out.println("8 to adopt a pet");
		System.out.println("9 to admit a pet");
		System.out.println("10 to quit");

	}

}
