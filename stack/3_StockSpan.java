import java.util.*;
class StockSpan{
    static void solve(int[] p){
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<p.length;i++){
            while(!s.isEmpty()&&p[s.peek()]<=p[i]) s.pop();
            int span=s.isEmpty()?i+1:i-s.peek();
            System.out.print(span+" ");
            s.push(i);
        }
    }
    public static void main(String[] a){
        solve(new int[]{100,80,60,70,60,75,85});
    }
}