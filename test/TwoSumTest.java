import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoSumTest {
    private TwoSum twoSum;
    @BeforeEach
    public void intializeTwoSum(){
        twoSum = new TwoSum();
    }

    @Test
    public void testThatTheTwoIndexReturnNine(){
        int[] nums = {2,7,11,15};
        int[] expected = {0,1};
        assertArrayEquals(expected, twoSum.getTwoSum(nums, 9));
    }

    @Test
    public void testThatTheTwoIndexReturnSix(){
        int[] nums = {3,2,4};
        int[] expected = {1,2};
        assertArrayEquals(expected, twoSum.getTwoSum(nums, 6));
    }

    @Test
    public void testThatTheTwoIndexWillAlsoReturnSix(){
        int[] nums = {3,3};
        int[] expected = {0,1};
        assertArrayEquals(expected, twoSum.getTwoSum(nums, 6));
    }
}
