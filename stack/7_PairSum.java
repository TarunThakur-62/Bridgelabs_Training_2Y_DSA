import java.util.*;
class PairSum{
    static void solve(int[] a,int target){
        Set<Integer> s=new HashSet<>();
        for(int x:a){
            if(s.contains(target-x)){
                System.out.println("Pair found");
                return;
            }
            s.add(x);
        }
    }
    public static void main(String[] a){
        solve(new int[]{1,4,5,6},9);
    }
}