import java.util.Date;

public class MainClassTest {

	public static void main(String[] args) {

		System.out.println("HelloWorld!");

		int i = 0;
		Date d = new Date();

		i++;
		System.out.println(i);
		System.out.println(d.toString());

		String dateFormat;
		dateFormat = String.format("yyyy/MM/dd mm:ss", d);

		System.out.println(dateFormat);

				for (int j = 0; j < 10000000; j++) {
					for (int k = 0; k < 10000000; k++) {
		
						System.out.println(j + "" + k);
		
					}
				}

		StringBuilder sb = new StringBuilder("a");
		System.out.println(sb.capacity());
				
		

	}

}
