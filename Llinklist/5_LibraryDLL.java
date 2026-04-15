class Book{
    int id; Book next,prev;
    Book(int i){id=i;}
}
public class LibraryDLL{
    Book head=null,tail=null;

    void add(int id){
        Book b=new Book(id);
        if(head==null){head=tail=b;return;}
        tail.next=b; b.prev=tail; tail=b;
    }

    void count(){
        int c=0; Book t=head;
        while(t!=null){c++;t=t.next;}
        System.out.println("Books="+c);
    }

    void display(){
        Book t=head;
        while(t!=null){System.out.println(t.id);t=t.next;}
    }

    public static void main(String[] a){
        LibraryDLL l=new LibraryDLL();
        l.add(1);l.add(2);
        l.display(); l.count();
    }
}
