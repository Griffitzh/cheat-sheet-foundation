import java.util.Arrays;

public class SubInt {
    public static void main(String[] args) {
        //FIND THE GIVEN NUMBER IN ANY GIVEN DIGIT PLACE
        //1: 11, 60, 41
        //9: 9, 99, 59 ....etc.

        // Examples:
        System.out.println(Arrays.toString(findMatchingIndexes(1, new int[]{1, 11, 34, 52, 61})));
        // should print: `[0, 1, 4]`
        System.out.println(Arrays.toString(findMatchingIndexes(9, new int[]{1, 11, 34, 52, 61})));
        // should print: '[]'
    }

    public static int[] findMatchingIndexes(int number, int[] myArray) {
        int tensD;
        int ondesD;
        int arrLength = 0;
        for (int i = 0; i < myArray.length; i++) {
            tensD = (myArray[i] / 10) % 10;
            ondesD = myArray[i] % 10;
            if (tensD == number || ondesD == number) {
                arrLength++;
            }
        }
        int[] returningAR = new int[arrLength];
        int jumper = 0;
        for (int i = 0; i < myArray.length; i++) {
            tensD = (myArray[i] / 10) % 10;
            ondesD = myArray[i] % 10;
            if (tensD == number || ondesD == number) {
                returningAR[jumper] = i;
                jumper++;
            }
        }
        return returningAR;
    }
}