import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input and
        // then draws a diamond of the specified height
        //
        // Example:
        //
        // Please enter the diamond height: 4
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // Note: the height of the diamond is taken from its base
        // (where it is the widest) to the top.
        // The total number of lines produced is 2*height-1

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the pyramid height: ");

        int height = input.nextInt();

        draw(height);
    }

    public static void draw(int height) {
        // Write your code to draw the diamond here
        int size = 2 * height - 1;
        int spaceAmount = 0;
        String point = "*";

        //draw lines for the diamond
        for (int i = 0; i < size; i++) {

            //generate spaces = height-1, then -1 every line onward
            int x = i + 1;

            if (i + 1 <= height) {
                spaceAmount = height - x;
                for (int s = 0; s < spaceAmount; s++) {
                    System.out.print(" ");
                }
                //generate 1 star the first time, then increment it by 2 every time
                for (int a = 0; a < i; a++) {
                    System.out.print(point + point);
                }
            } else {
                //after position passes height we do the reverse

                //we generate spaces, at height this looks like this: 1, 2 then 3
                spaceAmount = height - x;
                for (int s = size - (height * 2) + 1; s > spaceAmount; s--) {
                    System.out.print(" ");
                }

                //we generate stars after the middle at height 4 this is: 4, 2 then 0
                for (int a = size - 1; a > i; a--) {
                    System.out.print(point + point);
                }
            }

            //we break line and add a star
            System.out.println(point);
        }
    }
}