package practiceCoreJava1;

public class Tables {

	public static void main(String[] args) {
		System.out.println("Below are the Tables from 1 to 10 :");

		int i = 1;

		for (; i <= 10; i++)
			for (int j = 1; j <= 10; j++)
				System.out.println(i + "*" + j + " =" + i * j);

	}

}
