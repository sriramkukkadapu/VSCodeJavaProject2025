import java.util.HashMap;
import java.util.HashSet;

public class FindCommonElementsIn2Arrays {
public static void main(String args[]){
    int a[] = {1,2,0,9,4,3};
    int b[] = {2,13,2,3,-99,100};

    HashSet<Integer> set = new HashSet<Integer>();

    //Bruteforce approach

    for(int i=0;i<a.length;i++){
        int k=a[i];

        for(int j=0;j<b.length;j++){
            if(k==b[j])
                set.add(k);
        }
    }

    System.out.println(set);


    //Effective Approach - By taking Map

    HashMap<Integer,Boolean> map = new HashMap<Integer,Boolean>();
    set = new HashSet<Integer>();

    for(int i=0;i<a.length;i++){
        map.put(a[i], false);
    }

    for(int i=0;i<b.length;i++){
        if(map.containsKey(b[i])){
            if(map.get(b[i])==false){
                map.put(b[i],true);
                set.add(b[i]);
            }
        }
    }

    System.out.println("Approach 2: "+ set);
}
}
