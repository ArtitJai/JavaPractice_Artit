package day35_9thHW.CarpetCostCalculator;

public class Carpet {
	double cost;

	public Carpet(double cost) {
		super();
		this.cost = cost;
		
		if(cost < 0) this.cost = 0;
		else this.cost = cost;
	}
	
	public double getCost() {
		return cost;
	}
	
}
