package codechallenges;

public class ArrayShift {
    public static int[] insertShiftArray(int[] inputArray, int num) {
        int[] result = new int[inputArray.length + 1];
        int middle = result.length / 2;
        for (int i = 0; i < result.length; i++) {
            if (i == middle) {
                result[i] = num;
            } else if (i < middle ){
                result[i] = inputArray[i];
            } else {
                result[i] = inputArray[i - 1];
            }
        }
        return result;
    }
}
