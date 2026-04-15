class Movie {
    String title; Movie next,prev;
    Movie(String t){title=t;}
}
public class MovieDLL {
    Movie head=null,tail=null;

    void addEnd(String t){
        Movie m=new Movie(t);
        if(head==null){head=tail=m;return;}
        tail.next=m; m.prev=tail; tail=m;
    }

    void delete(String t){
        Movie x=head;
        while(x!=null && !x.title.equals(t))x=x.next;
        if(x==null)return;
        if(x==head)head=x.next;
        if(x==tail)tail=x.prev;
        if(x.prev!=null)x.prev.next=x.next;
        if(x.next!=null)x.next.prev=x.prev;
    }

    void display(){
        Movie t=head;
        while(t!=null){System.out.println(t.title);t=t.next;}
    }

    void reverse(){
        Movie t=tail;
        while(t!=null){System.out.println(t.title);t=t.prev;}
    }

    public static void main(String[] a){
        MovieDLL m=new MovieDLL();
        m.addEnd("KGF"); m.addEnd("RRR");
        m.display(); m.reverse();
    }
}
