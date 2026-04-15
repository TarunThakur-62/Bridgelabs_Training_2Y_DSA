class Ticket{
    int id; Ticket next;
    Ticket(int i){id=i;}
}
public class TicketSystemCLL{
    Ticket head=null;

    void add(int id){
        Ticket t=new Ticket(id);
        if(head==null){head=t;t.next=head;return;}
        Ticket temp=head;
        while(temp.next!=head)temp=temp.next;
        temp.next=t; t.next=head;
    }

    void display(){
        if(head==null)return;
        Ticket t=head;
        do{System.out.println(t.id);t=t.next;}while(t!=head);
    }

    public static void main(String[] a){
        TicketSystemCLL t=new TicketSystemCLL();
        t.add(1);t.add(2);
        t.display();
    }
}
