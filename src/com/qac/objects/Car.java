package com.qac.objects;

public class Car {
	// Data members
	private int ageOfCar;
	private String brandOfCar;
	private int engineSize;
	private int carGears;
	private int topSpeed;

	public Car(int ageOfCar, String brandOfCar, int engineSize, int carGears, int topSpeed) {
		this.ageOfCar = ageOfCar;
		this.brandOfCar = brandOfCar;
		this.engineSize = engineSize;
		this.carGears = carGears;
		this.topSpeed = topSpeed;

	}
	
	public String drive() {
		return "brmmmm";
	}

	public int getAgeOfCar() {
		if (ageOfCar > 20) {
			System.out.println("your car is way to old!");
			return 0;
		} else {
			return ageOfCar;
		}
	}

	public void setAgeOfCar(int ageOfCar) {
		if (ageOfCar > 20) {
			System.out.println("Your car is too old");
		} else {
			this.ageOfCar = ageOfCar;
		}
	}

	public String getBrandOfCar() {
		return brandOfCar;
	}

	public void setBrandOfCar(String brandOfCar) {
		this.brandOfCar = brandOfCar;
	}

	public int getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}

	public int getCarGears() {
		return carGears;
	}

	public void setCarGears(int carGears) {
		this.carGears = carGears;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	// This is our constructor

}
