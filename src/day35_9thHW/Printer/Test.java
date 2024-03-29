package day35_9thHW.Printer;

public class Test {
/*
 * # Printer Project

## Directions:

In this exercise you will create one class and name it `Printer`. This class will have two member
variables of type `int`, `tonerLevel` and `pagesPrinted`, and one if type `boolean`
called `duplex`. All three fields will heave `private` access. The constructor will accept two of
these variables, `tonerLevel` and `duplex`, as parameters following these rules:

- `tonerLevel` must be greater than `-1` but less than or equal to `100`. If it does not meet these
  conditions then it should be initialized to `-1`.
- `duplex` should be initialized to the value of the parameter.

In addition, `pagesPrinted` should be initialized to `0`.

Three other methods need to be defined in this way:

1. `andToner` will accept one parameter, `tonerAmount` of type `int`. First off, `tonerAmount`
   should be greater than 0 and less than or equal to 100. If this condition is met a second test
   must be included to test whether `tonerLevel` plus `tonerAmount` is greater than `100`. If so,
   the method should return `-1`. If not then `tonerLevel` should have the incoming
   `tonerAmount` added to it and the new `tonerLevel` should then be returned by the method. Also,
   if the initial condition test fails, then the method should return `-1`.
2. `printPages` will accept one parameter, `pages` of type `int`. A variable called `pagesToPrint`
   should be created and initialized to the value of the incoming parameter. A conditional check
   should be performed on whether the `Print` class field, `duplex`, is either `true` or `false`. if
   true then a calculation must be performed to determine the number of pages needed to print the
   job double sided. The `pagesToPrint` value is then added to the class field `pagesPrinted`, but
   the value of `pagesToPrint` should be returned by the method.
3. `getPagesPrinted` has no parameters and merely returns the value of the member variable
   `pagesPrinted`.

###Example input:

```java
class Main {
   public static void main(String[] args) {
      Printer printer = new Printer(50, true);
      System.out.println(printer.addToner(50));
      System.out.println("initial page count = " + printer.getPagesPrinted());
      int pagesPrinted = printer.printPages(4);
      System.out.println("Pages printed was " + pagesPrinted + 
              " new total print count for printer = " + print.getPagesPrinted());
      pagesPrinted = printer.printPages(2);
      System.out.println("Pages printed was " + pagesPrinted + 
                      " new total print count for printer = " + printer.getPagesPrinted());
   }
}
```
###Example output:
```text
100
initial page count = 0
Printing in duplex mode
Pages printed was 2 new total print count for printer = 2
Printing in duplex mode
Pages printed was 1 new total print count for printer = 3
```
###Tips:
1. Remember to only paste the code from `Printer` class into the exercise evaluator. The `Main` 
   class does not need to be pasted in.
2. You can include a message in the `printPages` method which informs the user that the printer is 
   printing in duplex mode if `duplex` is equal to `true` if you want.
3. When calculating `pagesToPrint` if `duplex` is equal to `true` remember that there are two 
   operators which can help you with this. The division `/` operator divides a number and 
   returns only the quotient without any remainder. And the modular `%` operator divides the 
   number and returns only the remainder, whether 0 or otherwise.
   */
	public static void main(String[] args) {
		

	}

}
