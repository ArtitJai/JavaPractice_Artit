package day34_HW_class_constructor;

import java.util.ArrayList;

public class MyOffer {

	/*
	 *  3. Create a class named MyOffers:

   3.1 Create 7 objects of Offer
   3.2 Create an array of Offers named myOffers and store all 7 objects of offers
   3.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
		3.3.1 Write a program that can remove the offer objects that are not full-time
   3.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
   3.4.1 Write a program that can remove all the offers that are not from local
   3.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
   3.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
   3.6 Create an ArrayList of Offer named sdetOffers and add all the offer objects.
   3.6.1 Write a program that can remove all the offers that are not for SDET
   3.7 Create an ArrayList of Offer named offersWith100K and add all the offer objects.
   3.7.1 Write a program that can remove all the offers that are offering less than 100K salary
	 */
	
	public static void main(String[] args) {
		
		// 3.1 Create 7 objects of Offer
		
		// Data pull from task 2
		
		// location, companyName, jobTitle, salary, benefit, PTO, WFH, fulltime
		
		Offer offer1 = new Offer();
		offer1.setInfo("CA", "Google", "SDET", 190000, true, true, false, true);
		
		Offer offer2 = new Offer();
		offer2.setInfo("VA", "Capital One", "SDET", 145000, true, true, true, true);
		
		Offer offer3 = new Offer();
		offer3.setInfo("WA", "Amazon", "FulStack", 180000, true, false, true, false);
		
		Offer offer4 = new Offer();
		offer4.setInfo("TX", "Tesla", "CyberSecurity", 200000, true, false, true, true);
		
		Offer offer5 = new Offer();
		offer5.setInfo("VA", "TechCircle", "SDET", 100000, false, false, true, false);
		
		Offer offer6 = new Offer();
		offer6.setInfo("FL", "TRUIST", "Front End", 89000, true, true, true, true);
		
		Offer offer7 = new Offer();
		offer7.setInfo("OK", "Macy", "SDET", 100000, true, true, true, true);
		
//		3.2 Create an array of Offers named myOffers and store all 7 objects of offers
		Offer[] myOffer = {offer1, offer2, offer3, offer4, offer5, offer6, offer7};
		
//		3.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
		ArrayList<Offer>fullTimeOffer = new ArrayList<>();
		
		for(int i = 0; i < myOffer.length; i++) {
			fullTimeOffer.add(myOffer[i]);
		}
		
//		3.3.1 Write a program that can remove the offer objects that are not full-time
		
//		for(int i = 0; i < fullTimeOffer.size(); i++) {
//			if(!fullTimeOffer.get(i).fullTime) {
//				fullTimeOffer.remove(i);
//			}
//		}
			fullTimeOffer.removeIf(i -> !i.fullTime);
		
//		3.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
		ArrayList<Offer>localOffers = new ArrayList<>();
		
		for(int i = 0; i < myOffer.length; i++) {
			localOffers.add(myOffer[i]);
		}
		
//		3.4.1 Write a program that can remove all the offers that are not from local
		
			localOffers.removeIf(i -> !i.location.equalsIgnoreCase("VA"));
		
//		3.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
		 ArrayList <Offer> offerWithBenefits = new ArrayList<>();
		 
		    for(int i = 0; i < myOffer.length; i++) {
		    	offerWithBenefits.add(myOffer[i]);
		    }
//		3.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
		
		    offerWithBenefits.removeIf(i -> !i.benefit && !i.PTO);
		    
//		3.6 Create an ArrayList of Offer named sdetOffers and add all the offer objects.
		ArrayList<Offer>sdetOffers = new ArrayList<>();
		    for(int i =0; i < myOffer.length; i++) {
		       sdetOffers.add(myOffer[i]);
		    }
		
//		3.6.1 Write a program that can remove all the offers that are not for SDET
		
		    sdetOffers.removeIf(i -> !i.jobTitle.equals("SDET"));
//		3.7 Create an ArrayList of Offer named offersWith100K and add all the offer objects.
		ArrayList <Offer>offerWith100K = new ArrayList<>();
		     for(int i = 0;i < myOffer.length; i++) {
		    	 offerWith100K.add(myOffer[i]);
		     }
//		3.7.1 Write a program that can remove all the offers that are offering less than 100K salary    
		    
		     offerWith100K.removeIf(i -> i.salary < 100000);
		    
		     System.out.println(myOffer.toString()); 
		     
	}
}
