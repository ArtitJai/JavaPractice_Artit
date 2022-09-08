package day22_HW;

public class Task06_Grade {

	public static void main(String[] args) {
		
			
//			given the following arrays:
//			String [] names = {"Anna", "Nancy", "Sarah"}; 
//			int [] scores = {90, 75, 80}; 
//			char [] grades = new char[names.length];
//			write a program that can store the grades of the students in the array named grades
//			print the grade report of each student in separate lines.
//			Example:
//
//			Anna's score is 90, and grade is A
		
		String[]names = {"Anna", "Nancy", "Sarah"};
        int[]scores = {90, 75, 80};    
        char[]grades = new char[names.length];
        
        for(int i = 0; i < names.length; i++) {
            
            if(scores[i] <= 100 && scores[i] >= 90) {
                grades[i] = 'A';
                
            }else if(scores[i] <= 89 && scores[i] >= 80) {
                grades[i] = 'B';
                
            }else if(scores[i] <= 79 && scores[i] >= 70) {
                grades[i] = 'C';
                
            }else if(scores[i] <= 69 && scores[i] >= 60) {
                grades[i] = 'D';
                
            }else if(scores[i] <= 59 && scores[i] >= 0) {
                grades[i] = 'F';
            }
            
            System.out.println(names[i] + "'s score is " + scores[i] + ", and grade is "+ grades[i]);

	}
	}
}
