package String;

public class DescendingOrder {

	public static void main(String[] args) {
		String s1 = "yash";
		char[] c = s1.toCharArray();
		for (int i = 0; i < c.length; i++) {

			for (int j = 0; j < c.length; j++) {

				if (i < j && c[i] < c[j]) {
					char temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}

			}

		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");

		}
	}

}
