package day48_javaReview.olive_press;

public class Olive {
	
	private String name;
	private String color;
	private int oil;
	
//	public abstract String getOrigin();
	
//	constructor
	public Olive() {}
	public Olive(String name) {
		this.name = name;
	}
	
	public Olive(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public Olive(int oil) {
		this.oil = oil;
	}
	
	public Olive(String name, String color, int oil) {
		this.name = name;
		this.color = color;
		this.oil = oil;
	}
	
	
	public void set(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getOil() {
		System.out.println("Ouch!!");
		return oil;
	}

	public void setOil(int oil) {
		this.oil = oil;
	}
	
	@Override
	public String toString() {
		return "Olive [name=" + name + ", color=" + color + ", oil=" + oil + "]";
	}
	
	
//	public String toString() {
//		
//	}

}
