package basic;

public class SearchingMethods {

	public static void main(String[] args) {
		// working with indexOf() method
		String s= "I LIKE JAVA LIKE JAVA";
		// returns first occurance of 'J' index position
		System.out.println("Index of J :: "+s.indexOf('J'));
		// search starts from index no.8
		System.out.println("Index of J from 8th index :: "+s.indexOf('J',8));
		// returns the first occurance of java
		System.out.println("Index of JAVA :: "+s.indexOf("JAVA"));
		// search starts from index no.4
		System.out.println("Index of LIKE from 4th index :: "+s.indexOf("LIKE",4));
		
		String s2 = "I LIKE JAVA LIKE JAVA";
		System.out.println("Last index of J :: "+s2.lastIndexOf('J'));
		// search starts from index no.16 to no.0
		System.out.println("Last index of J from 16th index :: "+s.lastIndexOf('J',16));
		// returns the last occurance index position of like
		System.out.println("Last index of LIKE :: "+s.lastIndexOf("LIKE"));
		// search starts from index no.9 to first index position
		System.out.println("Last index of LIKE from 9th index :: "+s.lastIndexOf("LIKE",9));
		
	}

}
