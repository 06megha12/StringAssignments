package String;

public class GarbageCollector {

	String str;

	public GarbageCollector(String str) {
		this.str = str;
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println(this.str + " collected");
	}

	public static void main(String[] args) {
		 GarbageCollector gc = new GarbageCollector("yash");
	        System.out.println("String=" + gc.str.toString());
	        gc = null;
	        System.gc();
	}

}
