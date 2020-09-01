package javacore12;

public class Engine{
	
	private int amountOfCylinders;

	public Engine(int amountOfCylinders) {
		super();
		this.amountOfCylinders = amountOfCylinders;
	}
	
	public int getAmountOfCylinders() {
		return amountOfCylinders;
	}

	public void setAmountOfCylinders(int amountOfCylinders) {
		this.amountOfCylinders = amountOfCylinders;
	}

	@Override
	public String toString() {
		return "Engine [amountOfCylinders=" + amountOfCylinders + "]";
	}
	
}
