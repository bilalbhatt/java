public class lab {
	public static void main(String[] args) {
		String targetString = "this is my first string";
		String s1= "BILAL";
		String s2= "bilal";
		System.out.println("Char at index 2(third position): " + targetString.charAt(2));
		System.out.println("After Concat: "+ targetString.concat(" lets us go"));
		System.out.println("Checking equals ignoring case: " +s2.equalsIgnoreCase(s1));
		System.out.println("Checking equals with case: " +s2.equals(s1));
		System.out.println("Checking Length: "+ targetString.length());
		System.out.println("SubString of targetString: "+ targetString.substring(8));
		System.out.println("SubString of targetString: "+ targetString.substring(8, 12));
		

	}

}
