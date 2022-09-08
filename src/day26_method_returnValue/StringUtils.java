package day26_method_returnValue;

public class StringUtils {

	public static void main(String[] args) {
		
		System.out.println(reverseStr("Artit"));
		System.out.println();
		
		String[] names = {"Mohammed Miran","Daniel Barat","Zolzaya Bazarragchaa","Austin Phumpeerawipob",
                "Eleonora Sheldon","Khemmanij  Stinebaugh","Nariman Tehrani","Larry Tran","Artit Jaikwang",
                "Stas Kalinin","Naga Chimeddash","Aiming Zhang","Zainab Noori","Chinonye Agu","Varawutt Thongdee",
                "Banu Bayramli","Christian Delaney","Dolkun","Anh Phan","Sakchai Amonnuntarat (Nat)","Emre Altun",
                "Jessica Rutherford","Arthur Dent","Gulfire Coskun","Kasira Benjapanan","Nelson Hernandez","Bosco iryamukuru"
                ,"Jandery Molina","Mamata Abdou","Nine Be","Keasinee Viriyakul","Prakaiwan Mangan","Phimnipha Nawalikhitsirikun",
                "Victoria Diaz","chairat chanthamart","Sasiwimol Tuisima","Ardong Kongsinjarernchai","Nuntaporn Noppakoon"};
		
		for(String name : names) {
			System.out.println(reverseStr(name));
		}
		
		String str = "civic";
//		
//		if(str.equalsIgnoreCase(reverseStr(str)));{
//			System.out.println("Palindrome");
//		}
//		else {
//			System.out.println("Not Palindrome");
//		}
		
		System.out.println();
		System.out.println(isPalindrome(str));
		
	}
		
	public static boolean isPalindrome(String str) {
		
		return str.equalsIgnoreCase(reverseStr(str));
	
	
	}
	public static String reverseStr(String str) {
		
		String reverse = "";
		
		for(int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		
		return reverse;
	}
}
