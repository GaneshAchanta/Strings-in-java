package basic;

public class StringModification {

	public static void main(String[] args) {
		// working with subString() method
		String s1 = "Hello";
		s1 = s1.substring(1);
		System.out.println(s1);
		
		//working with subString overloaded method
		String s2 = "Chaitanya";
		s2 = s2.substring(2,5);
		System.out.println(s2);
		
		//working with concat() method
		String s3 = "Cognizant";
		String s4 = s3.concat(" Software").concat(" Services").concat(" Ltd.");
		System.out.println(s4);
		
		//working with replace() method
		String s5 = "pog pance";
		s5 = s5.replace('p', 'd');
		System.out.println(s5);
		
		//working with replaceFirst() method
		String str = new String("facebook.com");
		System.out.println(str.replaceFirst("com", "net"));
		
		//working with replaceAll() method
		String str2 = new String("My  .com site is facebook.com");
		System.out.println(str2.replaceAll("com", "net"));
		
		//working with toUpperCase() method
		String s6 = "java";
		s6 = s6.toUpperCase();
		System.out.println(s6);
		
		//working with toLowerCase() method
		String s7 = "MY JAVA";
		s7 = s7.toLowerCase();
		System.out.println(s7);
		
	}

}
