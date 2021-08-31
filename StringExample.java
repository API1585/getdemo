package Day3;

public class StringExample {
	public static void concat(String s1) {
		s1 = s1+("world");
	}
	public static void concat1(StringBuffer s2) {
		s2.append("World");
	}
	public static void concat2(StringBuilder s3) {
		s3.append("World");
	}
	public static void main(String args[]) {
		String s1 = "Hello";
		concat(s1);
		System.out.println("String: "+s1);
		StringBuilder s2 = new StringBuilder("Hello");
		concat2(s2);
		System.out.println("StringBuilder: "+s2);
		StringBuffer s3 = new StringBuffer("Hello");
		concat1(s3);
		System.out.println("StringBuffer: "+s3);

	}
}
