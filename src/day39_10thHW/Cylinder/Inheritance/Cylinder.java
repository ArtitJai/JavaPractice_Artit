package day39_10thHW.Cylinder.Inheritance;

public class Cylinder extends Circle{
	double height;

	public Cylinder() {}
	public Cylinder(double height, double radius) {
		super(radius);
		if(height < 0)this.height = 0;
		else this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getVolume() {
		return super.getArea() * height;
	}
	
	
	
}
