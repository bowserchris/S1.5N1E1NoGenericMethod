package n1e1;

public class App {

	public static void main(String[] args) {
		
		NoGenericMethods<String> stringObjects = new NoGenericMethods<>("hello", "whats", "up");
		
		NoGenericMethods<Integer> intObjects = new NoGenericMethods<>(1, 2, 3);
		
		NoGenericMethods<Double> doubleObjects = new NoGenericMethods<>(1.5, 12.45, 123.55555);
		
		
		System.out.println(stringObjects);
		System.out.println(intObjects);
		System.out.println(doubleObjects);
	}

}
