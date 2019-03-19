public class Node {
    public static final int M =4;
    public int m; //hijos
    public Entry[] children = new Entry[M];

    public Node (int k){
        m=k;
    }
}
