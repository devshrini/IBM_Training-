package Day_7;

public class Pallindrome {
	
	public static boolean isPalindrome(String str) {
		if (str==null) {
			return false ;
		}
		String reversed = new StringBuilder(str).reverse().toString();
		return str.equals(reversed) ; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
