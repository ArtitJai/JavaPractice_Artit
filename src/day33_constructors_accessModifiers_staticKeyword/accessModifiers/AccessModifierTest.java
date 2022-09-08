package day33_constructors_accessModifiers_staticKeyword.accessModifiers;

public class AccessModifierTest {

	public static void main(String[] args) {
		
		// Class instantiation
		AccessModifiersIntro accessModifiers = new AccessModifiersIntro();
		
		// you are creating instance of AccessModifiersIntro class.
//		accessModifiers.readData(); 
		
		System.out.println(accessModifiers.url); // default
		
//		System.out.println(accessModifiers.age); private cannot read in another class.
		
		System.out.println(accessModifiers.gender); // protected
		
		System.out.println(accessModifiers.name); // public
		
		accessModifiers.methodA();
		accessModifiers.methodC();
		accessModifiers.methodD();
		accessModifiers.callingMethodB();

	}

}
