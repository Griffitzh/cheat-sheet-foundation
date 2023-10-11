import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
    public static void main(String[] args) {
        // Create a method called `decryptReversed` that takes a filename string
        // as a parameter and decrypts the file's content.
        // Decryption is the process reversing an encryption, i.e. the process
        // which converts encrypted data into its original form.
        // If the file can't be opened it should print this message: "File not found"
        // The (decrypted) result should be saved in the "outputReverse.txt" file (don't change the path).
        // Change the path of the reversed-lines.txt source file to the path
        // where you saved it on your computer.
        // You can find the source file in a link next to this exercise.
        decryptReversed("reversed-lines.txt");
    }

    private static void decryptReversed(String fileName) {
        String urlPath = "src/";
        String outputFileName = "outputReverse.txt";
        Path filepathSource = Paths.get(urlPath + fileName);
        Path filepathTarget = Paths.get(urlPath + outputFileName);

        List<String> fileCollector = null;
        List<String> linesCollector = new ArrayList<>();

        try {
            if (Files.notExists(filepathTarget)) {
                Files.createFile(filepathTarget);
            }
            fileCollector = Files.readAllLines(filepathSource, StandardCharsets.UTF_8);

        } catch (IOException e) {
            throw new RuntimeException("File not found");
        }

        char reverseChar = 0;
        String myString = "";

        //GO OVER EACH LINE
        for (int i = 0; i < fileCollector.size(); i++) {
            //GO OVER EACH WORD PER LINE
            for (int j = 0; j < fileCollector.get(i).length(); j++) {
                //CHECK THE LAST CHARACHTER AND INSERT INTO A NEW STRING
                reverseChar = fileCollector.get(i).charAt((fileCollector.get(i).length() - 1) - j);
                myString += Character.toString(reverseChar);
            }
            myString += "\n";
        }
        linesCollector.add(myString);
        System.out.println(linesCollector);


        try {
            Files.write(filepathTarget, linesCollector, StandardOpenOption.WRITE);
        } catch (IOException e) {
            throw new RuntimeException("File cannot be written");
        }
    }
}