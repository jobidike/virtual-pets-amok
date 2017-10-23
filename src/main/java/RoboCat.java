
public class RoboCat extends VirtualPet implements Robot {

	protected int oilLevel;

	public RoboCat(String name, String description, int play, int health, int happiness, int oilLevel) {
		super(name, description, play, health, happiness);
		this.oilLevel = oilLevel;
	}

	public int getOilRoboPets() {
		return oilLevel;
	}

	@Override
	public void oilRoboPets() {
		oilLevel -= 5;
	}

	@Override
	public String toString() {
		return super.toString() + "\t" + "\t" + "\t" + oilLevel;

	}

}
