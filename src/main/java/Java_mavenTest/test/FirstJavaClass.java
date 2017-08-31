package Java_mavenTest.test;

class FirstJavaClass {
	private static String txt = "java class default string";

	private static void printStr(String[] text) {				
		if (text.length == 0) {
			System.out.print(txt);
		} else {
			for (int i = 0; i < text.length; i++) {
				System.out.print("\n" + text[i]);
			}
		}
	}
	
	private static void hello(){
		printstr("ddddd");
	}

	private static void printstr(String string) {
		// TODO Auto-generated method stub
		System.out.print(string);
	}

	public static void main(String[] args) {
		printStr(args);
		hello();
	}
}
