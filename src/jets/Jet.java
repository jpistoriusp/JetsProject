package jets;

public class Jet extends Hangar{

	private String model, pilot;
	private float speed;
	private int range, price;
	
	public Jet() {}
	public Jet(String model, float speed, int range, int price) {
		this.model = model;
		this.speed = speed * 0.00131f;
		this.range = range;
		this.price = price;
		this.pilot = randomPilot();
	}
	
	public Jet(String model, float speed, int range, int price, String pilot) {
		this.model = model;
		this.speed = speed * 0.00131f;
		this.range = range;
		this.price = price;
		this.pilot = pilot;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed*0.00131f;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jet Model= ");
		builder.append(model);
		builder.append(", Speed(Machs)= ");
		builder.append(speed);
		builder.append(", Range(Miles)= ");
		builder.append(range);
		builder.append(", Price= $");
		builder.append(price);
		builder.append(", Pilot's Name= ");
		builder.append(pilot);
		return builder.toString();
	}
	
	public String randomPilot() {
		String nameA[] = {"Ryan", "Ben", "Sebastian", "Paul", "Nancy", "Eric", "Mike", "Jacob", "Miles"};
		int i = (int)((Math.random()*8));
		return nameA[i];
	}
	
}
