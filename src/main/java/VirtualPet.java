
public abstract class VirtualPet {
	
	// instance data
		protected String name;
		protected String description;
		protected int hunger;
		protected int waste;
		protected int boredom;
		protected int thirst;
		protected int happiness;
		
		protected int overallHealth = 10;

		// constructor
		public VirtualPet(String name, String description, int hunger, int waste, int boredom, int thirst, int health, int happiness) {
			this.name = name;
			this.description = description;
			this.hunger = hunger;
			this.waste = waste;
			this.boredom = boredom;
			this.thirst = thirst;
			this.happiness = happiness;
			
		}

		// Accessor method (getter)
		public String getName() {
			return name;
		}

		public String getDescription() {
			return description;
		}

		public int getHunger() {
			return hunger;
		}

		public int getWaste() {
			return waste;
		}

		public int getBoredom() {
			return boredom;
		}

		public int getThirst() {
			return thirst;
		}
		public int getHappiness() {
			return happiness;
		}
		
		public int getOverallHealth() {
			return overallHealth;
		}
		
		abstract int cleanPet();
		
	@Override
	public String toString() {
		return name + "\t" + description;
	}
		
}
