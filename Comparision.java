package basic;

public class Comparision {

	public static void main(String[] args) {
		String s1 = "java";//created in scp memory
		String s2 = "java";//already is there in scp, so new reference is created
		if (s1==s2) {//comparison between addresses
			System.out.println("Having same address");
		}
		else {
			System.out.println("Having different addresses");
		}
		String s3 = new String("Hello");
		String s4 = new String ("Hello");
		if (s3==s4) {
			System.out.println("Having same address");
		}
		else {
			System.out.println("Having different addresses");
		}

	}

}
