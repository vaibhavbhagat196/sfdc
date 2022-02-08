  class AccessClass {
	
	
	public static int publicField;
	protected static int protectedField;
	static int packageField;
	private static int privateField;
	
	static void methodInTheSameClass() {
		System.out.println(AccessClass.publicField);
		System.out.println(AccessClass.protectedField);
		System.out.println(AccessClass.packageField);
		System.out.println(AccessClass.privateField);
	}
}

public class AccessDemo {

	static void methodInOtherClass() {
		System.out.println(AccessClass.publicField);
		System.out.println(AccessClass.protectedField);
		System.out.println(AccessClass.packageField);
		System.out.println(AccessClass.privateField);
	}

}



