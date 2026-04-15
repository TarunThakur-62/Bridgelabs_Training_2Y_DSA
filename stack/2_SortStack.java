import java.util.*;
class SortStack {
    static void sort(Stack<Integer> s){
        if(!s.isEmpty()){
            int x=s.pop();
            sort(s);
            insert(s,x);
        }
    }
    static void insert(Stack<Integer> s,int x){
        if(s.isEmpty()||s.peek()<x){s.push(x);return;}
        int y=s.pop();
        insert(s,x);
        s.push(y);
    }
    public static void main(String[] a){
        Stack<Integer> s=new Stack<>();
        s.push(3);s.push(1);s.push(2);
        sort(s);
        System.out.println(s);
    }
}