class Process{
    int id; Process next;
    Process(int i){id=i;}
}
public class RoundRobinCLL{
    Process head=null;

    void add(int id){
        Process p=new Process(id);
        if(head==null){head=p;p.next=head;return;}
        Process t=head;
        while(t.next!=head)t=t.next;
        t.next=p; p.next=head;
    }

    void display(){
        if(head==null)return;
        Process t=head;
        do{System.out.println(t.id);t=t.next;}while(t!=head);
    }

    public static void main(String[] a){
        RoundRobinCLL r=new RoundRobinCLL();
        r.add(1);r.add(2);
        r.display();
    }
}
