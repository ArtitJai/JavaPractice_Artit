package day43_11thReview.inclass.Interface;


public class ParkingStation implements PrintTable, OpenInterface{
	@Override
	public void print() {
		System.out.println("Printing Park ticket");
	}
	@Override
	public void open() {
		System.out.println("Opening the gate");
	}
}
