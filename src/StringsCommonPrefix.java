
public class StringsCommonPrefix {
	
	public static void main(String args[]) {
		
		String[] input = {"flow", "flower", "floating"};
		
		String op = "";
		
		for(int i=0;i<input[0].length();i++) {
			
			char ch = input[0].charAt(i);
			System.out.println("Checking for char: "+ch);
			
		
			for(int j=0;j<input.length;j++) {
				System.out.println("i: "+i+", j: "+j+ ", input["+j+"]: "+input[j]);
				char ch2 = input[j].charAt(i);
				//check for all strings char at index i
				if(ch2==ch) {
					
				}
				else if(ch2!=ch) {
					System.out.println(op);
					System.exit(0);
				}
			}
			
			//if all matching append to final
			op=op+ch;
			System.out.println("o/p: "+op);
		}
		
		System.out.println(op);
	}

}
