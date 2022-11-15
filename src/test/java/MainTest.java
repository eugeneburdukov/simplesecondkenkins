import org.junit.Assert;
import org.junit.Test;

public class MainTest extends Main{

    @Test
    public void MainTest(){
        Main main = new Main();
        int temp = doCalculate(4);
        Assert.assertEquals(temp, 8);
    }
}
