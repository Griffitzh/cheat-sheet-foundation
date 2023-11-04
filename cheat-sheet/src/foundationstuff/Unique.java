package foundationstuff;

import java.util.ArrayList;
import java.util.List;

public class Unique {
    public static void main(String[] args) {

        // TAKE OUT UNIQUE UNITS AND LIST IT
        int[] numbers = new int[]{1, 11, 34, 11, 52, 61, 1, 34};
        System.out.println(findUniqueItems(numbers));
        // should print: `[1, 11, 34, 52, 61]`
    }

    public static List<Integer> findUniqueItems(int[] items) {

        List<Integer> newNumbers = new ArrayList<>();

        for (int item : items) {
            newNumbers.add(item);
        }

        int counter = 0;

        for (int i = 0; i < newNumbers.size(); i++) {
            for (int j = 0; j < newNumbers.size(); j++) {
                if (newNumbers.get(i).equals(newNumbers.get(j))) {
                    ++counter;
                    if (counter > 1) {
                        newNumbers.remove(newNumbers.get(j));
                        counter--;
                        if (i > 0) {
                            i--;
                        }
                    }
                }
            }
            counter = 0;
        }
        return newNumbers;
    }
}