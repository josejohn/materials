package fact.string;

public class SpringReverse {

	public static void main(String[] args) {
		System.out.println(reverseRecursively("jose"));
	}

	public static String reverseRecursively(String str) {

        //base case to handle one char string and empty string
        if (str.length() < 2) {
            return str;
        }

        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }

	 public static String reverse ( String s ) {
     int length = s.length(), last = length - 1;
     char[] chars = s.toCharArray();
     for ( int i = 0; i < length/2; i++ ) {
         char c = chars[i];
         chars[i] = chars[last - i];
         chars[last - i] = c;
     }
     return new String(chars);
 }



}
