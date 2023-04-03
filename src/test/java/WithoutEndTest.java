import com.digital.WithoutEnd;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WithoutEndTest {
    @Test
    public void checkWithoutEnd(){
        Assert.assertEquals(WithoutEnd.withoutEnd("Hello"), "ell" +
                "");
    }
}
