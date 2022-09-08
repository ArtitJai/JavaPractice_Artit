package day15_HW;

import java.util.Random;
import java.util.Scanner;

public class Task09_GuessingNumber {

	public static void main(String[] args) {
		
		/*## Task - Guessing Game

Create number guessing game between 1-100 for 1 player. the program should generate random number
between 1-100. then player keep guessing it until it's correct.

[comment]: <> (for 2 players.)

[comment]: <> (1st player will be the one who set the winner number.)

[comment]: <> (2nd player will be the one who guessing that number)

the program should have the following features:

- should ask name of the player
- have prompt to ask player to enter and the range of number.
```text
Please enter number between 1-100:
```
- if the guessing number is wrong, the program will give feedback to player that the guessing number
  is `greater` or `lower` than the winner number and ask player to try again

```text
<guess_number> is lower than winner number. Please try again
```

- the new prompt should get update with new range when, player enter the wrong guess


```text
// winner number is 45
Please enter number between 1-100:
>30
30 is lower than winner number. Please try again
Please enter number between 30-100:
>98
98 is higher than winner number. Please try again
Please enter number between 30-98:
```
- the program should keep track of the number of tries of the player
- if the player guess correct, it should display congratulation message, wining number, and number
  of tries

```
Congrats <name>, You've won. 
The winner number is <winner_number>
Your total guess are <number_of_times> times.
```

- after finish the program should prompt player to try again with display the high score of the
  previous game.

```
Would you like to try again. 
The best score is <number_of_guess> tries
```

Tip:
Use `Random` class and `.nextInt(100)` for generate random number between 1-100.
*/ 

		Random ran = new Random();
		
		boolean running = true;
		
		Scanner sc = new Scanner(System.in);
		
		int randomNumber = ran.nextInt(100)+1;
		
		System.out.println("Enter player Name:");
		
		String playerName = sc.next();
		
		for(int i = 1; running; i++) {
	
			
		System.out.println("\nEnter your guessing number:");
		
		int guess = sc.nextInt();
		
		if(guess == randomNumber) {
			System.out.println("Congrat \""+ playerName +"\" You've won");
			System.out.println("The winner number is "+randomNumber);
			System.out.println("Your total guess are "+i);
			break;
		}
		else if(randomNumber > guess) {
			System.out.println(guess +" is lower than winner number. Please try again");
		}
		else if(randomNumber < guess){
			System.out.println(guess +" is higher than winner number. Please try again");
		}
		}
		
		sc.close();
		
	}

}


//\n = new line , enter
// \t = tab ,  tab
// \\ = \
// \" = "


//		Scanner sc = new Scanner(System.in);
//		
//		// name
//		System.out.print("Please enter your name: ");
//		String playerName = sc.next();
//		
//		// winning number
//		Random rd = new Random();
//		int winningNumber = rd.nextInt(100) + 1;
//		System.out.println(winningNumber); // 1-100
//		// this will random number between 1-100
//		int max = 100;
//		int min = 1;
//		int countTry = 0;
//		int lowestScore = 0;
//		char tryAgain = 'N';
//		// ask user to guess the number
//		while (true) {
//		   while (true) { // run forever
//		      System.out.printf("Please enter number between %d-%d: ", min, max);
//		      int guessNumber = sc.nextInt();
//		      if (guessNumber > winningNumber) { // greater than winning number
//		         max = guessNumber - 1;
//		         System.out.println(guessNumber +
//		                               " is greater than winner number. Please try again");
//		         countTry++;
//		      }
//		      else if (guessNumber < winningNumber) { // lower than winning number
//		         min = guessNumber + 1;
//		         System.out.println(guessNumber +
//		                               " is lower than winner number. Please try again");
//		         countTry++;
//		      }
//		      else break; // winning case
//		   }
//		   System.out.println("Would you like to try again Y/N?"); // true
//		   tryAgain = sc.next().charAt(0);
//		   if (tryAgain == 'N') break;
//		   if (lowestScore > countTry) lowestScore = countTry;
//		}
//		
//		System.out.printf("Congrats \"%s\", You've won.\n", playerName);
//		System.out.printf("The winner number is %d\n",winningNumber);
//		System.out.printf("Your total guess are %d times.\n",countTry);
//		}
//		
//		
