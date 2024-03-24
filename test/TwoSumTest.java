import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoTest {

    @Test
    public void testTwoSum(){
        int[] array = {2,7,11,15};
        int[] expected = {0,1};
        TwoSum twoSum = new TwoSum();
        assertArrayEquals(expected, twoSum.getTwoSum(array, 9));
    }
}
