import java.util.*;
class LongestConsecutive{
    static int solve(int[] a){
        Set<Integer> s=new HashSet<>();
        for(int x:a)s.add(x);
        int max=0;
        for(int x:a){
            if(!s.contains(x-1)){
                int y=x,len=1;
                while(s.contains(y+1)){y++;len++;}
                max=Math.max(max,len);
            }
        }
        return max;
    }
    public static void main(String[] a){
        System.out.println(solve(new int[]{100,4,200,1,3,2}));
    }
}