package lottery;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Lottery {
    public static void main(String[] args) {
        String filename = "src/lottery/lottery.csv";
        List<String> lines = new ArrayList<>();

        try {
            lines = Files.readAllLines(Paths.get(filename));
        } catch (IOException e) {
            throw new RuntimeException("file cannot read");
        }

        String number = "14";
        try {
            int toNumber = Integer.parseInt(number);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Thats not a number");
        }

        List<String> numbers = new ArrayList<>();

        for (String line : lines) {
            for (int i = 0; i < 5; i++) {
                //ONLY TAKE IN DATAS FROM the 11th ";" SO WE ONLY TAKE IN LOTTERY NUMBERS
                numbers.add(line.split(";")[11 + i]);
            }
        }

        Map<String, Integer> numbersMap = new HashMap<>();
        for (String element : numbers) {
            if (!numbersMap.containsKey(element)) {
                numbersMap.put(element, 0);
            }
            numbersMap.put(element, numbersMap.get(element) + 1);
        }

        for (Map.Entry<String, Integer> entry : numbersMap.entrySet()) {
            // System.out.println(entry);;
        }

        String[] bestNumbers = new String[5];

        for (int i = 0; i < 5; i++) {
            String maxLetter = "";
            Integer maxOccurrency = 0;
            for (Map.Entry<String, Integer> entry : numbersMap.entrySet()) {
                if (entry.getValue() > maxOccurrency) {
                    maxOccurrency = entry.getValue();
                    maxLetter = entry.getKey();
                }
            }
            bestNumbers[i] = maxLetter;
            numbersMap.remove(maxLetter);
        }
        System.out.println(Arrays.toString(bestNumbers));
    }


}
