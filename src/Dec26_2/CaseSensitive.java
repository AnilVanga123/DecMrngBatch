package Dec26_2;

public class CaseSensitive {

	public static void main(String[] args) {
	String str1="Hello";
	String str2="hello";
	String str3="HELLO";
	String str4="Hello";
	System.out.println(str1.equals(str2));
	System.out.println(str1.equals(str4));
	System.out.println(str1.equalsIgnoreCase(str3));
	}

}
