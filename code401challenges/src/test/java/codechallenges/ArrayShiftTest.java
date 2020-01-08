package codechallenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayShiftTest {
    @Test
    public void testInsertShiftArrayEvenLength() {
        int[] input = new int[]{1,2,3,4};
        int[] expected = new int[]{1,2,99,3,4};
        assertArrayEquals("Should insert number into middle of the input array", expected, ArrayShift.insertShiftArray(input,99));
    }
    @Test
    public void testInsertShiftArrayOddlength() {
        int[] input = new int[]{1,2,3,4,5};
        int[] expected = new int[]{1,2,3,99,4,5};
        assertArrayEquals("Should insert number into middle of the input array", expected, ArrayShift.insertShiftArray(input,99));
    }
}
