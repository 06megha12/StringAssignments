package String;

public class MemoryHeap {

	public static void main(String[] args) {
		String s1 = new String("Megha"); 

		String s2 = new String("Megha"); 

		String s3 = "Megha"; 

		String s4 = "Megha";

		System.out.println("s1: " + s1.hashCode());
		System.out.println("s2: " + s2.hashCode());
		System.out.println("s3: " + s3.hashCode());
		System.out.println("s4: " + s4.hashCode());

		System.out.println(s1.equals(s3)); // contains are same
		System.out.println("In Heap memory: " + s1 == s3);

	}

}
