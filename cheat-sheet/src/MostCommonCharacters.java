
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class MostCommonCharacters {
    public static void main(String[] args) {
        System.out.println(getTwoMostCommonCharacters("src/com/gfa/exam/input.txt"));
    }

    public static Map<Character, Integer> getTwoMostCommonCharacters(String fileName){
        Path inputPath = Paths.get(fileName);
        List<String> lines = new ArrayList<>();

        try {
            lines = Files.readAllLines(inputPath);
        } catch (IOException e){
            throw new RuntimeException("File does not exist!");
        }

        Map<String, Integer> lettersWithOccurrences = new HashMap<>();
        for(String line : lines){
            String[] wordsOfLine = line.split(" ");

            for (String word : wordsOfLine){
                String[] lettersOfWord = word.split("");

                for (String letter : lettersOfWord){
                    if(!lettersWithOccurrences.containsKey(letter)){
                        lettersWithOccurrences.put(letter, 1);
                    } else {
                        Integer occurrency = lettersWithOccurrences.get(letter);
                        lettersWithOccurrences.put(letter, ++occurrency);
                    }
                }
            }
        }

        Map<Character, Integer> twoMostCommon = new HashMap<>();

        //NOT SURE IF WORKS, DIDN'T CHECK LOGIC YET
        int numberOfChecks = lettersWithOccurrences.size() != 2 ? 2 : lettersWithOccurrences.size();

        for (int i = 0; i < numberOfChecks; i++) {
            String maxLetter = "";
            Integer maxOccurrency = 0;

            for (Map.Entry<String, Integer> entry : lettersWithOccurrences.entrySet()) {
                if (entry.getValue() > maxOccurrency) {
                    maxOccurrency = entry.getValue();
                    maxLetter = entry.getKey();
                }
            }
            twoMostCommon.put(maxLetter.charAt(0), maxOccurrency);

            lettersWithOccurrences.remove(maxLetter);

        }

        return twoMostCommon;
    }
}