
public class Increasing$ {

	public static void main(String args[]) {
		
		String s = "go to soho";
		char ch = 'o';
		int count=0;
		String result="";
		
//		System.out.println(getCountOfChars(5));
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == ch)
			{
				count++;
				result = result + getCountOfChars(count);
			}
			else
				result = result + s.charAt(i);				
		}
		
		System.out.println(result);
		
	}
	
	public static String getCountOfChars(int count) {
		char ch='$';
		String s="";
		for(int i=1;i<=count;i++) {
			s=s+ch;
		}
		
		return s;
	}
}
