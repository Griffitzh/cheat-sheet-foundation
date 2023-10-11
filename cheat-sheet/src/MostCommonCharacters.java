
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class MostCommonCharacters {
    public static void main(String[] args) {
        System.out.println(getTwoMostCommonCharacters("src/countchar.txt"));
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
        //FILL HASMAP WITH LETTERS AND THE OCCURENCE AMOUNT AS VALUES
        for(String line : lines){
            //SPLIT LINES WORDS
            String[] wordsOfLine = line.split(" ");

            for (String word : wordsOfLine){
                //SPLIT WORDS TO CHARS (still a string)
                String[] lettersOfWord = word.split("");

                for (String letter : lettersOfWord){
                    //IF ITS NOT YET PART OF KEY, then INSERT KEY & VALUE
                    if(!lettersWithOccurrences.containsKey(letter)){
                        lettersWithOccurrences.put(letter, 1);
                    } else {
                        //OTHERWISE INCREASE OCCURENCE AMOUNT
                        Integer occurrency = lettersWithOccurrences.get(letter);
                        lettersWithOccurrences.put(letter, ++occurrency);
                    }
                }
            }
        }

        //NEW HASMAP FOR THE 2 HIGHEST VALUE KEYS
        Map<Character, Integer> twoMostCommon = new HashMap<>();

        //IF THE OVERALL LETTER DIVERSITY IS NOT ENOUGH WE DO A SHORTER FOR LOOP
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
            //INSERT THE STRING CONVERTED TO CHAR and THE OCCURENCE AMOUNT
            twoMostCommon.put(maxLetter.charAt(0), maxOccurrency);

            //REMOVE FROM MAP COLLECTION SO WE CAN FIND THE NEXT BING THING
            lettersWithOccurrences.remove(maxLetter);

        }

        return twoMostCommon;
    }
}