package day22_HW;

public class Task11_ReturnNumberOfAppearance {

	public static void main(String[] args) {
		
//		Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence. 
//		(similar to the task in repl.it, but this time you MUST use arrays and for each loop)

		
		String sentence = "I like java and javascript python python";

        sentence = sentence.toLowerCase();

        int countJava = 0;  
        int countPython = 0;
        String[] words = sentence.split(" ");  

        for (String each : words) {

            if (each.contains("java")) {
                countJava++;
            }

            if (each.contains("python")) {
                countPython++;
            }


        }
        System.out.println(countJava);
        System.out.println(countPython);
	}

}
