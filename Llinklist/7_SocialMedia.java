class User{
    int id; User next;
    User(int i){id=i;}
}
public class SocialMedia{
    User head=null;

    void add(int id){
        User u=new User(id);
        u.next=head; head=u;
    }

    void display(){
        User t=head;
        while(t!=null){System.out.println(t.id);t=t.next;}
    }

    public static void main(String[] a){
        SocialMedia s=new SocialMedia();
        s.add(1);s.add(2);
        s.display();
    }
}
