package day34_HW_class_constructor;

public class Offer {
	/*
	 2. Create a custom class named Offer
     Attributes:
             location, companyName, jobTitle, salary, hasBenefit, hasPTO, isWFH, isFullTime
     Actions:
         setInfo(): sets all the instance variables
         toString(): returns the full info of the Offer Object 
         */
	
	String location;
	String company;
	String jobTitle;
	int salary;
	boolean benefit;
	boolean PTO;
	boolean WFH;
	boolean fullTime;
	
	

	@Override
	public String toString() {
		return "Offer [location=" + location + ", company=" + company + ", title=" + jobTitle + ", salary=" + salary
				+ ", benefit=" + benefit + ", PTO=" + PTO + ", WFH=" + WFH + ", fullTime=" + fullTime + "]";
	}
	
	
	public void setInfo(String location, String company, String jobTitle, int salary, 
			boolean benefit, boolean PTO, boolean WFH, boolean fullTime) {
		
		this.location = location;
		this.company = company;
		this.jobTitle = jobTitle;
		this.salary = salary;
		this.benefit = benefit;
		this.PTO = PTO;
		this.WFH = WFH;
		this.fullTime = fullTime;
	}


}
