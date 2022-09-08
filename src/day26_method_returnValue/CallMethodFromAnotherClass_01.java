package day26_method_returnValue;

import day25_method.MethodWithParameters;

public class CallMethodFromAnotherClass_01 {

	public static void main(String[] args) {
		
		NamePicker_01.Cohort11RandomNamePicker();
		
		MethodWithParameters.sayHelloWithName("Dekizugi");
	}

}
