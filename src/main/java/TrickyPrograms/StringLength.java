package TrickyPrograms;

public class StringLength {

	public static void main(String[] args) {
		// How to find length of string in java without using length method?
		 String str="testing";
		 System.out.println(str.toCharArray().length);
		 //System.out.println(str.length());
		 System.out.println(str.lastIndexOf(""));

	}

}
