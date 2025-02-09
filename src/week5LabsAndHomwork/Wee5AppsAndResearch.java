package week5LabsAndHomwork;

public class Wee5AppsAndResearch {

	public static void main(String[] args) {
		
		System.out.println(isAPalindrome("mom"));
	}
	
	
public static boolean isAPalindrome(String word) {
	boolean answer = false;
	for (int i=0; i < (word.length()/2); i++) {
		
		if (word.charAt(i) != (word.charAt((i)-1)-i)) {
			answer = false;
		} else {
			answer = true;
		} // else
	} //for
return answer;	
} // method
	
} // class
