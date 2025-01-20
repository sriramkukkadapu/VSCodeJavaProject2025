
public class NearestPallindromeForGivenNumber {
	
	public static void main(String args[]) {
		
		//25 = 22 not 33
		//4723 = 4774
		// 99800 = 99799
		// 11011 = 11111
		//1000 = 1001 or 999
		// 489 = 484
		
		System.out.println(isPallindrome(22));
		
		int n=489;
		int i=n,j=n;
		
		while(true) {
			i--;
			if(isPallindrome(i)==true) {
				System.out.println(i);
//				System.exit(0);
				break;
			}
			
			j++;
			if(isPallindrome(j)==true) {
				System.out.println(j);
//				System.exit(0);
				break;
			}
			
			if(i==0)
				break;
		}
		
	}
	
	public static boolean isPallindrome(int n) {
		StringBuffer s = new StringBuffer(""+n);
		StringBuffer rev = new StringBuffer(s);
		rev.reverse();
//		System.out.println("String 1: "+s);
//		System.out.println("String 2: "+rev);
		if(s.compareTo(rev)==0)
			return true;
		else
			return false;
	}
	

}
