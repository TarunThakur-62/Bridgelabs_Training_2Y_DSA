import java.util.*;
class TwoSum{
    static void solve(int[] a,int target){
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(m.containsKey(target-a[i])){
                System.out.println(m.get(target-a[i])+" "+i);
                return;
            }
            m.put(a[i],i);
        }
    }
    public static void main(String[] a){
        solve(new int[]{2,7,11,15},9);
    }
}