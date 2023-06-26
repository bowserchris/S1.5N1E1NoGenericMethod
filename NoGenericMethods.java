package n1e1;

public class NoGenericMethods <String> {
	
	private String obj1;
	private String obj2;
	private String obj3;
	
	public NoGenericMethods(String t1, String t2, String t3) {
		this.obj1 = t1;
		this.obj2 = t2;
		this.obj3 = t3;
	}

	public String getObj1() {
		return obj1;
	}

	public void setObj1(String obj1) {
		this.obj1 = obj1;
	}

	public String getObj2() {
		return obj2;
	}

	public void setObj2(String obj2) {
		this.obj2 = obj2;
	}

	public String getObj3() {
		return obj3;
	}

	public void setObj3(String obj3) {
		this.obj3 = obj3;
	}

	@Override
	public String toString() {
		return "NoGenericMethods [obj1=" + obj1 + ", obj2=" + obj2 + ", obj3=" + obj3 + "]";
	}
	
	

}

/*Create a class called NoGenericMethods that stores three objects
 *  of the same type, along with the methods to store and retrieve 
 *  those objects, and a constructor to initialize all three. Check
 *   that arguments can be placed anywhere in the constructor call.
 * 
 * 
 * 
 * */
