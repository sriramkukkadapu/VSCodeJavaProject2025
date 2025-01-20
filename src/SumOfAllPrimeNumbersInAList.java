// import java.util.HashSet;
// import java.util.TreeSet;

public class SumOfAllPrimeNumbersInAList {

	public static void main(String args[]) {
		
//		System.out.println("isPrime(2): "+isPrime(2));
//		System.out.println("isPrime(7): "+isPrime(7));
//		System.out.println("isPrime(6): "+isPrime(6));
	
		
		int a[] = {2,3,4,7,8};
		int sum=0;	
		int min=2,max=0;
		for(int i=0;i<a.length;i++) {
			if(isPrime(a[i])==true) {
				sum= sum+a[i];
				if(a[i]<min)
					min=a[i];
				if(a[i]>max)
					max=a[i];
			}
		}
		
		System.out.println("Sum: "+sum);
		
		
		int sumlh = min+max;
		System.out.println("Sum of highest & lowest prime = "+sumlh);
	}
	
	public static boolean isPrime(int n) {
		int factors = 0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				factors++;
		}
		if(factors==2)
			return true;
		else
			return false;
	}
	
	
}
