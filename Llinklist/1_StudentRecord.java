import java.util.*;

class Student {
    int roll; String name; int age; char grade;
    Student next;
    Student(int r,String n,int a,char g){
        roll=r; name=n; age=a; grade=g;
    }
}

public class StudentRecord {
    Student head=null;

    void addEnd(int r,String n,int a,char g){
        Student s=new Student(r,n,a,g);
        if(head==null){head=s;return;}
        Student t=head;
        while(t.next!=null)t=t.next;
        t.next=s;
    }

    void delete(int r){
        Student t=head,p=null;
        while(t!=null && t.roll!=r){p=t;t=t.next;}
        if(t==null)return;
        if(p==null)head=t.next;
        else p.next=t.next;
    }

    void search(int r){
        Student t=head;
        while(t!=null){
            if(t.roll==r){
                System.out.println("Found "+t.name);
                return;
            }
            t=t.next;
        }
        System.out.println("Not found");
    }

    void update(int r,char g){
        Student t=head;
        while(t!=null){
            if(t.roll==r){t.grade=g;return;}
            t=t.next;
        }
    }

    void display(){
        Student t=head;
        while(t!=null){
            System.out.println(t.roll+" "+t.name+" "+t.age+" "+t.grade);
            t=t.next;
        }
    }

    public static void main(String[] a){
        StudentRecord s=new StudentRecord();
        s.addEnd(1,"Ram",20,'A');
        s.addEnd(2,"Shyam",21,'B');
        s.display();
    }
}
