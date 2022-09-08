package day33_constructors_accessModifiers_staticKeyword.staticMethodAndVariables;

public class Test {

	public static void main(String[] args) {
		
		// static is blong to the class, you don't have to create instance of the class.
		
		System.out.println(ClassWithStaticMembers.name);
		
		ClassWithStaticMembers.readValue();
		
//		System.out.println(ClassWithStaticMembers.age);
		
		ClassWithStaticMembers m = new ClassWithStaticMembers();
		System.out.println(m.age);
		
		ClassWithNonStaticMembers nstatic = new ClassWithNonStaticMembers();
		
		System.out.println(nstatic.name);
		
		nstatic.readValue();

	}

}
