import java.util.HashSet;

public class FIndPairsOfSumHashSetApproach {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,-1,-2,7,6,0};
        int target = 5;

        HashSet<Integer> hset = new HashSet<Integer>();

        for(int i=0;i<a.length;i++){
            int cur = a[i];
            int balance = target-cur;
            if(hset.contains(balance)){
                System.out.println(cur+","+balance);
            }
            hset.add(cur);
        }
    }
}
