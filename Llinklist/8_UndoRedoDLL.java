class State{
    String text; State next,prev;
    State(String t){text=t;}
}
public class UndoRedoDLL{
    State cur=null;

    void add(String t){
        State s=new State(t);
        if(cur!=null){cur.next=s; s.prev=cur;}
        cur=s;
    }

    void undo(){
        if(cur!=null && cur.prev!=null)cur=cur.prev;
    }

    void redo(){
        if(cur!=null && cur.next!=null)cur=cur.next;
    }

    void show(){
        if(cur!=null)System.out.println(cur.text);
    }

    public static void main(String[] a){
        UndoRedoDLL u=new UndoRedoDLL();
        u.add("A"); u.add("B");
        u.undo(); u.show();
    }
}
