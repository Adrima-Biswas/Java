/*
    1. String is a class in java.
    2. that can store the sequence of 
       characters enclosed by double quote.
    3. A string acts the same as an array of characters.
       ex:-
           char[] arr = {'a','b','c'}; >> arr[0] = a; arr.length = 3
           String str = "abc"; >> str.charAt(0) = a; str.length() = 3
    4. String is a immutable.
*/
public class Main {
	public static void main(String[] args) {
	    // String declaration in java
	    String str1 = "Hello World";
	    String str2 = new String("How are you?");
		System.out.println(str1);
		System.out.println(str2);
	}
}
