
public class SumOfNumbersInAString {
	
	public static void main(String args[]) {
		
		String s = "1abc2cde23fhk";
		String num = "";
		int sum = 0;
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(Character.isDigit(ch)) {
				num=num+ch;
			}
			else {
			if(!num.equals("")) {
				//sum here 
				sum = sum + Integer.parseInt(num);
				System.out.println("Adding To sum: "+num);
				num = "";
			}		
				
			}
		}
		
		System.out.println("Sum: "+sum);
	}

}
