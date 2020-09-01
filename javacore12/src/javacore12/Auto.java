package javacore12;

public class Auto {

	private int horsePower;
	private int manufactureYear;
	private SteeringWheel steeringwheel;
	private Engine engine;
	
	public Auto(int horsePower, int manufactureYear, SteeringWheel steeringwheel, Engine engine) {
		super();
		this.horsePower = horsePower;
		this.manufactureYear = manufactureYear;
		this.steeringwheel = steeringwheel;
		this.engine = engine;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public int getManufactureYear() {
		return manufactureYear;
	}

	public void setManufactureYear(int manufactureYear) {
		this.manufactureYear = manufactureYear;
	}

	public SteeringWheel getSteeringwheel() {
		return steeringwheel;
	}

	public void setSteeringwheel(SteeringWheel steeringwheel) {
		this.steeringwheel = steeringwheel;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Auto [horsePower=" + horsePower + ", manufactureYear=" + manufactureYear + ", steeringwheel="
				+ steeringwheel + ", engine=" + engine + "]";
	}
}
