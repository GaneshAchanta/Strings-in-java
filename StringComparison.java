package basic;

public class StringComparison {

	public static void main(String[] args) {
		// working with equals() method
		String s1 = "hello";
		String s2 = "welcome";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals("hello"));
		
		//working with equalsIgnoreCase() method
		String s3 = "hello";
		System.out.println(s3.equalsIgnoreCase("Hello"));
		
		//working with regionMatches() method
		String str1 = new String("Hello, How are you");
		String str2 = new String("How");
		String str3 = new String("HOW");
		System.out.println(str1.regionMatches(7, str2, 0, 3));
		System.out.println(str1.regionMatches(0, str3, 0, 3));
		
		//working startsWith() method
		String s4 = "refresh java";
		System.out.println(s4.startsWith("refresh"));
		
		//working with endsWith() method
		String str4 = new String("This is a test String");
		boolean var1 = str4.endsWith("String");
		System.out.println("Str4 ends with string : "+var1);
		
		//working with compareTo() method
		String str5 = "boy";
		String str6 = "girl";
		int var2 = str5.compareTo(str6);
		System.out.println("str5 & str6 comparison : "+var2);

	}

}
