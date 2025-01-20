import java.util.Map;
import java.util.TreeMap;

public class OrderSentenceAsPerNumber {
	
	public static void main(String args[]) {
		/*
		 * WAP for below case where it sorts the words in the sentence based on the number at the end of the word.
				Example 1:
				Input: s = "is2 sentence4 This1 a3"
				Output: "This is a sentence"
		 * 
		 */
		String s_input = "is2 sentence4 This1 a3";
		
		separateStringAndNumber("is2");
		
		Map<Integer,String> map= new TreeMap<Integer,String>();
		
		for(String str : s_input.split(" ")) {
			String[] sep = separateStringAndNumber(str);
			map.put(Integer.parseInt(sep[0]), sep[1]);
		}
		
		System.out.println(map);
		
	}
	
	

	public static String[] separateStringAndNumber(String s) {
		String[] res = new String[2];
		
		int i=0;
		for(;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)))
				break;
		}
		
//		System.out.println(s.substring(0,i));
//		System.out.println(s.substring(i,s.length()));
		
		res[1] = s.substring(0,i);
		res[0] = s.substring(i,s.length());
		
		return res;
	}
}
