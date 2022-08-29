package String;

public class StringBufferAndBuilder {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		System.out.println("startTime=" + startTime);
		StringBuffer sb = new StringBuffer();
		sb.append('S');
		long stopTime = System.nanoTime();
		System.out.println("stopTime=" + stopTime);
		System.out.println("String buffer time Required=" + (stopTime - startTime));

		long startTime1 = System.nanoTime();
		StringBuilder sbuilder = new StringBuilder();
		sbuilder.append('A');
		long stopTime1 = System.nanoTime();
		System.out.println("stopTime=" + stopTime1);
		System.out.println("String Buildler time Required=" + (stopTime1 - startTime1));

	}

}
