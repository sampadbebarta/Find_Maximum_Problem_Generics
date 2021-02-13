import com.bridgelabz.CheckMaximumValue;
import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {
    // Integer Number
    @Test
    public void givenThreeIntegerNumber_findMaximumNumber_shouldReturnSameNo() {
        Integer maxElement = CheckMaximumValue.findMaxValue(400, 100, 200, 150);
        Assert.assertEquals((Integer) 400, maxElement);
    }

    @Test
    public void givenThreeIntegerNumber_findMaximumNumber_shouldReturnSecondNo() {
        Integer maxElement = CheckMaximumValue.findMaxValue(100, 400, 200, 250);
        Assert.assertEquals((Integer) 400, maxElement);
    }

    @Test
    public void givenThreeIntegerNumber_findMaximumNumber_shouldReturnThirdNo() {
        Integer maxElement = CheckMaximumValue.findMaxValue(100, 200, 400, 150);
        Assert.assertEquals((Integer) 400, maxElement);
    }

    // Float Number
    @Test
    public void givenThreeFloatNumber_findMaximumNumber_shouldReturnSameNo() {
        Float maxElement = CheckMaximumValue.findMaxValue(40.40f, 10.10f, 20.20f);
        Assert.assertEquals((Float) 40.40f, maxElement);
    }

    @Test
    public void givenThreeFloatNumber_findMaximumNumber_shouldReturnSecondNo() {
        Float maxElement = CheckMaximumValue.findMaxValue(10.10f, 40.40f, 20.20f);
        Assert.assertEquals((Float) 40.40f, maxElement);
    }

    @Test
    public void givenThreeFloatNumber_findMaximumNumber_shouldReturnThirdNo() {
        Float maxElement = CheckMaximumValue.findMaxValue(10.10f, 20.20f, 40.40f);
        Assert.assertEquals((Float) 40.40f, maxElement);
    }

    //String
    @Test
    public void givenThreeString_findMaximumString_shouldReturnSameString() {
        String maxElement = CheckMaximumValue.findMaxValue("Peach", "Banana", "Apple");
        Assert.assertEquals("Peach", maxElement);
    }

    @Test
    public void givenThreeString_findMaximumString_shouldReturnSecondString() {
        String maxElement = CheckMaximumValue.findMaxValue("Banana", "Peach", "Apple");
        Assert.assertEquals("Peach", maxElement);
    }

    @Test
    public void givenThreeString_findMaximumString_shouldReturnThirdString() {
        String maxElement = CheckMaximumValue.findMaxValue("Banana", "Apple", "Peach", "Orange");
        Assert.assertEquals("Peach", maxElement);
    }
}
