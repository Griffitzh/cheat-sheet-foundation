package foundationstuff;

public class Anagram {
    /*
        DOESNT IGNORE SPACE SO ONLY 90% working, kinda
        i.e. "Astronomer" is an anagram of "Moon starer!"
     */

    public static void main(String[] args) {
        System.out.println(isAnagram("dog", "god"));
        System.out.println(isAnagram("dog", "God"));
        System.out.println(isAnagram("green", "fox"));
        System.out.println(isAnagram("cheese", "eeechs"));

        //SPACE SENSITIVITY IS MISSING!!!
        System.out.println(isAnagram("Astronomer", "Moon starer"));
    }

    public static boolean isAnagram(String word1, String word2) {
        Boolean trueOrFalse = false;
        if (word1.length() != word2.length()) {
            trueOrFalse = false;
        } else {
            //checkletters
            for (int i = 0; i < word1.length(); i++) {
                char letter = word1.toLowerCase().charAt(i);
                int counter1 = 0;
                int counter2 = 0;
                for (int j = 0; j < word1.length(); j++) {
                    if (letter == word1.toLowerCase().charAt(j)) {
                        counter1++;
                    }
                }
                for (int j = 0; j < word2.length(); j++) {
                    if (letter == word2.toLowerCase().charAt(j)) {
                        counter2++;
                    }
                }
                if (counter1 == counter2) {
                    trueOrFalse = true;
                } else {
                    trueOrFalse = false;
                    return trueOrFalse;
                }
            }
        }
        return trueOrFalse;
    }
}