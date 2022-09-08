package day26_method_returnValue;

import java.util.Random;

public class NamePicker_01 {
	
	public static void Cohort11RandomNamePicker() {
		
	    String[] names = {"Mohammed Miran","Daniel Barat","Zolzaya Bazarragchaa","Austin Phumpeerawipob",
                "Eleonora Sheldon","Khemmanij  Stinebaugh","Nariman Tehrani","Larry Tran","Artit Jaikwang",
                "Stas Kalinin","Naga Chimeddash","Aiming Zhang","Zainab Noori","Chinonye Agu","Varawutt Thongdee",
                "Banu Bayramli","Christian Delaney","Dolkun","Anh Phan","Sakchai Amonnuntarat (Nat)","Emre Altun",
                "Jessica Rutherford","Arthur Dent","Gulfire Coskun","Kasira Benjapanan","Nelson Hernandez","Bosco iryamukuru"
                ,"Jandery Molina","Mamata Abdou","Nine Be","Keasinee Viriyakul","Prakaiwan Mangan","Phimnipha Nawalikhitsirikun",
                "Victoria Diaz","chairat chanthamart","Sasiwimol Tuisima","Ardong Kongsinjarernchai","Nuntaporn Noppakoon"};
        
        
//        	System.out.println(names.length);
        	
        	Random random = new Random();
        	int randomIndex = random.nextInt(names.length); // 0 ~ names.length == 38
        	
        	if(randomIndex == names.length) {
        		randomIndex --;
        	}
        	System.out.println(names[randomIndex]);
//        	System.out.println(random.nextInt(10));
//        	
//        	for(int i = 0; i < 11; i++) {
//        		System.out.println(random.nextInt(names.length));
//        		
//        		int randomIndex = random.nextInt(names.length);
//        		System.out.println(names[randomIndex]);
//        	}
	}
	
	public static void main(String[] args) {
		
		Cohort11RandomNamePicker();
		
}
}