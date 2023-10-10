import java.util.Scanner;

public class DrawChessTable {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input and
        // then draws a chess table of the specified size
        //
        // Example:
        //
        // Please enter the chess table size: 8
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the chess table size: ");

        int size = input.nextInt();

        draw(size);
    }

    public static void draw(int size) {
        // Write your code to draw the chess table here

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                if (i == 0 || i % 2 == 0) {
                    String character = (j == 0 || j % 2 == 0) ? "%" : " ";
                    System.out.print(character);
                } else {
                    String character = (j % 2 != 0) ? "%" : " ";
                    System.out.print(character);
                }
            }

            System.out.println();
        }
    }
}