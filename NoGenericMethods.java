package n1e1;

public class NoGenericMethods <T> {
	
	private T obj1;
	private T obj2;
	private T obj3;
	
	public NoGenericMethods(T t1, T t2, T t3) {
		this.obj1 = t1;
		this.obj2 = t2;
		this.obj3 = t3;
	}

	public T getObj1() {
		return obj1;
	}

	public void setObj1(T obj1) {
		this.obj1 = obj1;
	}

	public T getObj2() {
		return obj2;
	}

	public void setObj2(T obj2) {
		this.obj2 = obj2;
	}

	public T getObj3() {
		return obj3;
	}

	public void setObj3(T obj3) {
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
