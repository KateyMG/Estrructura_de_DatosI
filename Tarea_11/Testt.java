import org.junit.Assert;
import org.junit.Test;

public class Testt {

    BTree<String, String> st = new BTree<String, String>();
    @Test
    public void TestBtree(){
        //ver si se llena
        boolean x= false;
        st.put("A", "aa");
        boolean y =st.isEmpty();
        Assert.assertEquals(x,y);
    }

    public void TestBtree2(){

        boolean x= true;

        boolean y =st.isEmpty();
        Assert.assertEquals(x,y);
    }
    public void TestBtree3(){

        int x= 2;
        st.put("A", "aa");
        st.put("A", "aa");
        int y = st.size();
        Assert.assertEquals(x,y);
    }

}
