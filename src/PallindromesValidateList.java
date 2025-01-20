
public class PallindromesValidateList {
	
	public static void main(String args[]) {
		
		//Validate List of Pallindromes  given
		//i/p: {"refer","level","radar","madam","abc"}
		//o/p: {true,true,true,true,false}
		
		String s[] = {"refer","level","radar","madam","abc"};
		
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]+": "+isPallindrome(s[i]));
		}
		
		
	}
	
	public static boolean isPallindrome(String s) {
		StringBuffer s2 = new StringBuffer(s);
		s2 = s2.reverse();
		String s3=s2.toString();
		if(s.equals(s3)) {
			return true;
		}
		else
			return false;
	}

}
