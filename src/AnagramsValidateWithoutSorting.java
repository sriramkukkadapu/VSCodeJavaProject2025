import java.util.HashMap;

public class AnagramsValidateWithoutSorting {

    public static void main(String args[]){
        
        String s1 = "state";
        String s2 = "taste";

        HashMap<Character,Integer> map1 = stringToMap(s1);
        HashMap<Character,Integer> map2 = stringToMap(s2);

        System.out.println();
        System.out.println(stringToMap(s2));

        System.out.println(map1.equals(map2));
    }

    public static HashMap<Character,Integer> stringToMap(String s){
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                int count = map.get(ch);
                count++;
                map.put(ch, count);
            }
            else{
                map.put(ch,1);
            }
        
        }
        return map;
    }

}
