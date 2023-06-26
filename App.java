package n1e1;

public class App {

	public static void main(String[] args) {
		
		NoGenericMethods<String> string1 = new NoGenericMethods<>("hello", "whats", "up");
		
		NoGenericMethods<String> string2 = new NoGenericMethods<>("i", "did", "this");
		
		NoGenericMethods<String> string3 = new NoGenericMethods<>("a", "bit", "different");
		
		
		System.out.println(string1);
		System.out.println(string2);
		System.out.println(string3);
	}

}
