import java.util.*;
class ZeroSumSubarray{
    static void solve(int[] a){
        Map<Integer,Integer> m=new HashMap<>();
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            if(sum==0||m.containsKey(sum))
                System.out.println("Found");
            m.put(sum,i);
        }
    }
    public static void main(String[] a){
        solve(new int[]{1,2,-3,3});
    }
}