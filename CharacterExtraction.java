package basic;

public class CharacterExtraction {

	public static void main(String[] args) {
		//working with charAt() method
		String name = "James Smith";
		char ch1 = name.charAt(3);
		char ch2 = name.charAt(6);
		char ch3 = name.charAt(9);
		System.out.println(ch1 + "\t" + ch2 + "\t" + ch3);
		
		//working with getChars() method
		String s = "Its Beyong Simple";
		int start = 4, end = 10;
		//start -> represent index position from where extraction starts
		//end -> represent index position from where extraction ends+1 position
		char storage[] = new char [end-start]; //used to store multiple extracted characters 
		s.getChars(start, end, storage, 0);
		System.out.println(storage);
		
		//working with getBytes() method
		String Str1 = new String("Welcome to TalentSprint");
		byte[] b = Str1.getBytes(); //byte array having all characters with ASCII values
		for(byte a:b)
			System.out.println(a);
		
		//working with toCharArray() method
		String str = new String("Welcome to My World");
		char[] ch = str.toCharArray(); //array contains the all characters of the string
		for(char c:ch)
			System.out.println(c);
	}

}
