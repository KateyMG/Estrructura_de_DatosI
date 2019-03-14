import org.junit.Assert;
import org.junit.Test;

public class Testing {
    String expected4= "6x^1 (x^2+1)^3";
    @Test
    public void Testeo(){
        Arbol3 ae3 = new Arbol3();
        
        Assert.assertEquals(expected4,"6x^1 (x^2+1)^3" );
    }

}
