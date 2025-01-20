
public class ArmstrongNumberValidateList {
	
	public static void main(String args[]) {
		int[] a = {153,121,370,371,9474,0};
		boolean[] res = new boolean[a.length];
		System.out.println("Hello");
		for(int i=0;i<a.length;i++){
			res[i] = isArmStrong(a[i]);
		}
		
		for(int i=0;i<a.length;i++){
			System.out.print(res[i]+" ");
		}
	}
	
	
	public static boolean isArmStrong(int n) {
		
		String s=""+n;
		int size = (""+n).length();
		int sum=0;
	
		int total = 0;
		
		for(int i=0;i<s.length();i++) {
			int digit = Integer.parseInt(s.charAt(i)+"");
			sum = (int) (sum+ Math.pow(digit, size));
			
		}
		
		// System.out.println(sum);
		
		if(n==sum)
			return true;
		else
			return false;
	}

}
