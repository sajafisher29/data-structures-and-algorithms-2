package codechallenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTest {
    @Test
    public void searchTest() {
        int testNumber = 3;
        int[] testArray = new int[]{1,2,3,4,5,6,7};
        assertEquals("Placeholder",2,BinarySearch.binarySearchArray(testArray,testNumber));
    }
    @Test
    public void searchFail() {
        int testNumber = 5;
        int[] testArray = new int[]{1,2,3,4};
        assertEquals("Placeholder",-1,BinarySearch.binarySearchArray(testArray,testNumber));
    }
}