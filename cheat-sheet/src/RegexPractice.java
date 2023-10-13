import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractice {

    public static void main(String[] args) {

        //REGEX PRACTICE
        String myString = "apple";
        String[] stringList = myString.split("");
        //[aeuio] will result in finding the desired chars
        //while [^aeuio] will result in the opposite(we don't wanna find them
        Matcher matcher = Pattern.compile("[^aeuio]").matcher(stringList[1]);

        //System.out.println(Arrays.toString(stringList));
        if (matcher.find()) {
            //  System.out.println("nem magánhangzó a második betü");
        }

        //REGEX NUMBERS

        int myNumber = 909;
        String myNumberConverted = Integer.toString(myNumber);
        String[] splitNumber = myNumberConverted.split("");

        Matcher matcher1 = Pattern.compile("[0-9]").matcher(splitNumber[1]);

        if (matcher1.find()) {
            //System.out.println("Found a number between 0-9");
        }

        //Regex Pattern : Full words example
        //ignores whitespace but not charachter order
        String myAnimals = "cta dgo";

        Matcher matcher2 = Pattern.compile("cat|dog").matcher(myAnimals);

        if (matcher2.find()) {
            //System.out.println("matcher 2 has match");
        }
        //Find just ONE Instance of W at random instance of the given string
        String findWillie = "wlkanfoiahoiWillieq3tgrwfsgWWQAD+T";
        Matcher matcher3 = Pattern.compile(".ll", Pattern.CASE_INSENSITIVE).matcher(findWillie);

        if (matcher3.find()) {
            //  System.out.println(matcher3.replaceFirst("*"));
        }

        //find a string that starts with given string using: ^
        //returns true if string starts with given pattern
        //space sensitive
        String something = "some thing";
        Matcher matcher4 = Pattern.compile("^some ").matcher(something);

        if (matcher4.find()) {
            //System.out.println("some has been found");
        }

        //find a string ending with: $
        //returns true if string is ending with given string$

        String endingWith = "dinosaur eating ice";
        Matcher dinosaurHasIceCream = Pattern.compile("ice$").matcher(endingWith);

        if (dinosaurHasIceCream.find()) {
            //System.out.println("dinosaur has ice in the end");
        }
        String[] manyEndings = endingWith.split(" ");
        Matcher manyMatcher = Pattern.compile("saur$").matcher(manyEndings[0]);
        Matcher manyMatcher2 = Pattern.compile("ing$").matcher(manyEndings[1]);
        Matcher manyMatcher3 = Pattern.compile("ce$").matcher(manyEndings[2]);
        if (manyMatcher.find() && manyMatcher2.find() && manyMatcher3.find()) {
            //System.out.println("all ending patterns returning true after spliting");
        }

        // find a digid \\d{3} length of digits, ignores spaces
        //properly finds numbers in string


        String myDigit = "asd 123 ba";
        Matcher findDigit = Pattern.compile("\\d{3}").matcher(myDigit);

        if (findDigit.find()) {
            System.out.println("Returns true, ignores spaces");
        }

    }
}
