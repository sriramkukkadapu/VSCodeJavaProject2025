import java.util.LinkedHashMap;

public class OwelsCountInAString {
    public static void main(String args[]){
        String s = "happy testing";
        
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character,Integer>();

        initializeMap(map);
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    int count = map.get(ch);
                    count++;
                    map.put(ch,count);
                }
        }
        System.out.println(map);
    }

    public static void initializeMap(LinkedHashMap<Character,Integer> map){
        map.put('a', 0);
        map.put('e', 0);
        map.put('i', 0);
        map.put('o', 0);
        map.put('u', 0);
    }
}
