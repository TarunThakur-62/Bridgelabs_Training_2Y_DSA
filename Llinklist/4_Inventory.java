class Item{
    int id,qty; double price;
    Item next;
    Item(int i,int q,double p){id=i;qty=q;price=p;}
}
public class Inventory{
    Item head=null;

    void add(int i,int q,double p){
        Item n=new Item(i,q,p);
        n.next=head; head=n;
    }

    void total(){
        double sum=0;
        Item t=head;
        while(t!=null){sum+=t.qty*t.price;t=t.next;}
        System.out.println("Total="+sum);
    }

    void display(){
        Item t=head;
        while(t!=null){
            System.out.println(t.id+" "+t.qty+" "+t.price);
            t=t.next;
        }
    }

    public static void main(String[] a){
        Inventory i=new Inventory();
        i.add(1,2,100); i.add(2,3,50);
        i.display(); i.total();
    }
}
