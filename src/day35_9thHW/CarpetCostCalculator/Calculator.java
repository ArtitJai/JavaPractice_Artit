package day35_9thHW.CarpetCostCalculator;

public class Calculator {
	Floor floor;
	Carpet carpet;
	public Calculator(Floor floor, Carpet carpet) {
		super();
		this.floor = floor;
		this.carpet = carpet;
	}
	
	public double getTotalCost() {
		return carpet.getCost() * floor.getArea();	
	}
	
}
