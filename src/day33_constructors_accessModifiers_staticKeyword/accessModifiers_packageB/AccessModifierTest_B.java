package day33_constructors_accessModifiers_staticKeyword.accessModifiers_packageB;

import day33_constructors_accessModifiers_staticKeyword.accessModifiers.AccessModifiersIntro;

public class AccessModifierTest_B {
	public static void main(String[] args) {
		
		AccessModifiersIntro ac = new AccessModifiersIntro();
		
		System.out.println(ac.name);
//		System.out.println(ac.age); private
//		System.out.println(ac.url); protected
//		System.out.println(ac.gender); protected
		
//		ac.methodA();
//		ac.methodB();
//		ac.methodC();
		ac.methodD();
		
	}

}
