package basic;

public class JoinTest {

	public static void main(String[] args) {
		String s1 = "All the best for your bright future";
		String []s = s1.split(" ");
		for(String token:s)
			System.out.println(token);
				String []s2 = s1.split(" ",5);
				for(String token2:s2)
					System.out.println(token2);
				System.out.println("Multiple Delimeters");
				String s3 = "hello$world welcome @ my world , java";
				String[] s4 = s3.split("['$','@'',',']");
				for(String tokens:s4)
					System.out.println(tokens);

	}

}
