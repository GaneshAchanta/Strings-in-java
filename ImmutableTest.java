package basic;

public class ImmutableTest {

	public static void main(String[] args) {
		String s1 = "Java";
		s1.concat("Rules");//don't have reference
		System.out.println(s1);
		
		String s2 = "Good";
		s2 = s2.concat(" Boy");
		System.out.println(s2);

	}

}
