import com.bridgelabz.CheckMaximumValue;
import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {
    // Integer Number
    @Test
    public void givenThreeIntegerNumber_findMaximumNumber_shouldReturnSameNo() {
        CheckMaximumValue checkMaximumValue = new CheckMaximumValue();
        Integer maxNum = checkMaximumValue.findMaxValue(400, 100, 200, 150);
        Assert.assertEquals((Integer) 400, maxNum);
    }

    @Test
    public void givenThreeIntegerNumber_findMaximumNumber_shouldReturnSecondNo() {
        CheckMaximumValue checkMaximumValue = new CheckMaximumValue();
        Integer maxNum = checkMaximumValue.findMaxValue(100, 400, 200, 250);
        Assert.assertEquals((Integer) 400, maxNum);
    }

    @Test
    public void givenThreeIntegerNumber_findMaximumNumber_shouldReturnThirdNo() {
        CheckMaximumValue checkMaximumValue = new CheckMaximumValue();
        Integer maxNum = checkMaximumValue.findMaxValue(100, 200, 400, 150);
        Assert.assertEquals((Integer) 400, maxNum);
    }

    // Float Number
    @Test
    public void givenThreeFloatNumber_findMaximumNumber_shouldReturnSameNo() {
        CheckMaximumValue checkMaximumValue = new CheckMaximumValue();
        Float maxFloatValue = checkMaximumValue.findMaxValue(40.40f, 10.10f, 20.20f);
        Assert.assertEquals((Float) 40.40f, maxFloatValue);
    }

    @Test
    public void givenThreeFloatNumber_findMaximumNumber_shouldReturnSecondNo() {
        CheckMaximumValue checkMaximumValue = new CheckMaximumValue();
        Float maxFloatValue = checkMaximumValue.findMaxValue(10.10f, 40.40f, 20.20f);
        Assert.assertEquals((Float) 40.40f, maxFloatValue);
    }

    @Test
    public void givenThreeFloatNumber_findMaximumNumber_shouldReturnThirdNo() {
        CheckMaximumValue checkMaximumValue = new CheckMaximumValue();
        Float maxFloatValue = checkMaximumValue.findMaxValue(10.10f, 20.20f, 40.40f);
        Assert.assertEquals((Float) 40.40f, maxFloatValue);
    }

    //String
    @Test
    public void givenThreeString_findMaximumString_shouldReturnSameString() {
        CheckMaximumValue maximumString = new CheckMaximumValue();
        String maxString = maximumString.findMaxValue("Peach", "Banana", "Apple");
        Assert.assertEquals("Peach", maxString);
    }

    @Test
    public void givenThreeString_findMaximumString_shouldReturnSecondString() {
        CheckMaximumValue maximumString = new CheckMaximumValue();
        String maxString = maximumString.findMaxValue("Banana", "Peach", "Apple");
        Assert.assertEquals("Peach", maxString);
    }

    @Test
    public void givenThreeString_findMaximumString_shouldReturnThirdString() {
        CheckMaximumValue maximumString = new CheckMaximumValue();
        String maxString = maximumString.findMaxValue("Banana", "Apple", "Peach", "Orange");
        Assert.assertEquals("Peach", maxString);
    }
}
