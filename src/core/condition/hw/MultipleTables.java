package core.condition.hw;

public class MultipleTables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 2; i <= 10; i++) {
			System.out.println("Printing multiplication table of:" + i);
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
		}
		System.out.println("All Given Tables Printed");

	}

}
