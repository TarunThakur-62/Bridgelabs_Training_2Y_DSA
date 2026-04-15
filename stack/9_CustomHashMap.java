class CustomHashMap{
    static class Node{
        int key,val; Node next;
        Node(int k,int v){key=k;val=v;}
    }
    Node[] map=new Node[10];

    void put(int k,int v){
        int i=k%10;
        Node n=new Node(k,v);
        n.next=map[i];
        map[i]=n;
    }

    int get(int k){
        int i=k%10;
        Node t=map[i];
        while(t!=null){
            if(t.key==k)return t.val;
            t=t.next;
        }
        return -1;
    }

    public static void main(String[] a){
        CustomHashMap m=new CustomHashMap();
        m.put(1,100);
        System.out.println(m.get(1));
    }
}