package codechallenges;

public class BinarySearch {
    public static int binarySearchArray(int[] inputArray , int number) {
        int beg = 0;
        int end = inputArray.length -1;
        while (beg <= end) {
            int middle = (beg + end) / 2;
            if (inputArray[middle] == number) {
                return middle;
            } else if(inputArray[middle] < number) {
                beg = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;
    }
}
