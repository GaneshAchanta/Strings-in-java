package basic;

public class BufferTest {

	public static void main(String[] args) {
		// working with append() method
		StringBuffer strBuffer = new StringBuffer("Core ");
		strBuffer.append(" Java Guru");
		System.out.println(strBuffer);
		
		//working with insert() method
		StringBuffer strBuffer2 = new StringBuffer("Core ");
		strBuffer2.insert(1, "Java");
		System.out.println(strBuffer2);
		
		//working with replace() method
		StringBuffer strBuffer3 = new StringBuffer("Core");
		strBuffer3.replace(2, 4, "Java");
		System.out.println(strBuffer3);
		
		//working with reverse() method
		StringBuffer strBuffer4 = new StringBuffer("Core");
		strBuffer4.reverse();
		System.out.println(strBuffer4);
		
		//working with delete() method
		StringBuffer strBuffer5 = new StringBuffer("Core");
		strBuffer5.delete(2, 4);
		System.out.println(strBuffer5);
		
		//working with capacity() method
		StringBuffer strBuffer6 = new StringBuffer();
		System.out.println(strBuffer6.capacity());
		strBuffer6.append("1234");
		System.out.println(strBuffer6.capacity());

	}

}
