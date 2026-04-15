import java.util.*;
class SlidingWindow{
    static void solve(int[] a,int k){
        Deque<Integer> d=new LinkedList<>();
        for(int i=0;i<a.length;i++){
            while(!d.isEmpty()&&d.peek()<i-k+1)d.poll();
            while(!d.isEmpty()&&a[d.peekLast()]<a[i])d.pollLast();
            d.offer(i);
            if(i>=k-1) System.out.print(a[d.peek()]+" ");
        }
    }
    public static void main(String[] a){
        solve(new int[]{1,3,-1,-3,5,3,6,7},3);
    }
}