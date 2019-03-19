public class BTree<Key extends Comparable<Key>, Value> {

    public static final int M =4;

    public Node root;
    public int altura;
    public int n; //keys


    public BTree(){
        root = new Node(0);
    }

    public boolean isEmpty(){
        return size()==0;
    }

    public int size(){
        return n;
    }


    public int altura(){
        return altura;
    }

    public Value get(Key key){
        if(key == null)throw new IllegalArgumentException("argument to get() is null");
        return search(root, key, altura);
    }

    public Value search(Node x, Key key, int alt){
        Entry[]children = x.children;

        if(alt ==0){
            for(int j=0; j< x.m; j++){
                if(eq(key, children[j].key))return (Value) children[j].val;
            }

       }
        else{
            for(int j=0; j< x.m; j++){
                if(j+1 ==x.m || less(key, children[j+1].key))
                    return search(children[j].next, key, alt-1);
            }
        }return null;
    }

    public void put(Key key, Value val){
        if(key==null) throw new IllegalArgumentException("argument key to put is null");
        Node u = insert(root, key, val, altura);
        n++;
        if(u == null)return;

        Node t = new Node(2);
        t.children[0]= new Entry(root.children[0].key, null, root);
        t.children[1]= new Entry(u.children[0].key, null, u);
        root = t;
        altura++;

    }

    public Node insert(Node h, Key key, Value val, int alt){
        int j;
        Entry t = new Entry(key, val, null);

        if(alt == 0){
            for(j=0;j< h.m; j++){
                if(less(key,h.children[j].key))break;
            }
        }
        else{
            for(j=0; j<h.m;j++){
               if((j+1==h.m)|| less(key, h.children[j+1].key)){
                   Node u = insert(h.children[j++].next,key, val, alt-1);
                   if(u== null)return null;
                   t.key = u.children[0].key;
                   t.next =u;
                   break;
                }
            }
        }
        for(int i = h.m; i>j; i--)
            h.children[i]=h.children[i-1];
        h.children[j]=t;
        h.m++;
        if(h.m< M) return null;
        else return split(h);
    }

    public Node split(Node h){
        Node t = new Node(M/2);
        h.m = M/2;
        for(int j=0; j< M/2; j++)
            t.children[j]= h.children[M/2+j];
        return t;
    }

    public boolean less(Comparable k1, Comparable k2){
        return  k1.compareTo(k2)==0;
    }

    public boolean eq(Comparable k1, Comparable k2){
     return k1.compareTo(k2)==0;
    }


    public String toString(){
        return toString(root, altura, "")+ "\n";
    }

    public String toString(Node h, int alt, String indent)
    {
        StringBuilder s = new StringBuilder();
        Entry[] children = h.children;

        if (alt == 0) {
            for (int j = 0; j < h.m; j++) {
                s.append(indent + children[j].key + " " + children[j].val + "\n");
            }
        }
        else {
            for (int j = 0; j < h.m; j++) {
                if (j > 0) s.append(indent + "(" + children[j].key + ")\n");
                s.append(toString(children[j].next, alt-1, indent + "     "));
            }
        }
        return s.toString();
}








}
