import com.bridgelabz.MaximumNumber;
import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {
    // Integer Number
    @Test
    public void givenThreeIntegerNumber_findMaximumNumber_shouldReturnSameNo() {
        MaximumNumber maximumNumber = new MaximumNumber();
        int maxNum = maximumNumber.findMaxIntegerValue(400, 100, 200);
        Assert.assertEquals(400, maxNum);
    }

    @Test
    public void givenThreeIntegerNumber_findMaximumNumber_shouldReturnSecondNo() {
        MaximumNumber maximumNumber = new MaximumNumber();
        int maxNum = maximumNumber.findMaxIntegerValue(100, 400, 200);
        Assert.assertEquals(400, maxNum);
    }

    @Test
    public void givenThreeIntegerNumber_findMaximumNumber_shouldReturnThirdNo() {
        MaximumNumber maximumNumber = new MaximumNumber();
        int maxNum = maximumNumber.findMaxIntegerValue(100, 200, 400);
        Assert.assertEquals(400, maxNum);
    }

    // Float Number
    @Test
    public void givenThreeFloatNumber_findMaximumNumber_shouldReturnSameNo() {
        MaximumNumber maximumNumber = new MaximumNumber();
        Float maxFloatValue = maximumNumber.findMaxFloatValue(40.40f, 10.10f, 20.20f);
        Assert.assertEquals((Float) 40.40f, maxFloatValue);
    }

    @Test
    public void givenThreeFloatNumber_findMaximumNumber_shouldReturnSecondNo() {
        MaximumNumber maximumNumber = new MaximumNumber();
        Float maxFloatValue = maximumNumber.findMaxFloatValue(10.10f, 40.40f, 20.20f);
        Assert.assertEquals((Float) 40.40f, maxFloatValue);
    }

    @Test
    public void givenThreeFloatNumber_findMaximumNumber_shouldReturnThirdNo() {
        MaximumNumber maximumNumber = new MaximumNumber();
        Float maxFloatValue = maximumNumber.findMaxFloatValue(10.10f, 20.20f, 40.40f);
        Assert.assertEquals((Float) 40.40f, maxFloatValue);
    }

    //String
    @Test
    public void givenThreeString_findMaximumString_shouldReturnSameString() {
        MaximumNumber maximumString = new MaximumNumber();
        String maxString = maximumString.findMaxString("Peach", "Banana", "Apple");
        Assert.assertEquals("Peach", maxString);
    }

    @Test
    public void givenThreeString_findMaximumString_shouldReturnSecondString() {
        MaximumNumber maximumString = new MaximumNumber();
        String maxString = maximumString.findMaxString("Banana", "Peach", "Apple");
        Assert.assertEquals("Peach", maxString);
    }

    @Test
    public void givenThreeString_findMaximumString_shouldReturnThirdString() {
        MaximumNumber maximumString = new MaximumNumber();
        String maxString = maximumString.findMaxString("Banana", "Apple", "Peach");
        Assert.assertEquals("Peach", maxString);
    }
}
