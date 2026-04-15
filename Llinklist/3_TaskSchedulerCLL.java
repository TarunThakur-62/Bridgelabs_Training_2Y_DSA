class Task{
    int id; Task next;
    Task(int i){id=i;}
}
public class TaskSchedulerCLL{
    Task head=null;

    void add(int id){
        Task n=new Task(id);
        if(head==null){head=n;n.next=head;return;}
        Task t=head;
        while(t.next!=head)t=t.next;
        t.next=n; n.next=head;
    }

    void delete(int id){
        Task t=head,p=null;
        do{
            if(t.id==id){
                if(p!=null)p.next=t.next;
                else{
                    Task last=head;
                    while(last.next!=head)last=last.next;
                    head=t.next; last.next=head;
                }
                return;
            }
            p=t; t=t.next;
        }while(t!=head);
    }

    void display(){
        if(head==null)return;
        Task t=head;
        do{System.out.println(t.id);t=t.next;}while(t!=head);
    }

    public static void main(String[] a){
        TaskSchedulerCLL t=new TaskSchedulerCLL();
        t.add(1);t.add(2);t.display();
    }
}
