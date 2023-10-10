public class Diagonal {
    // DIAGONAL
    //DIAGONAL matrix
    public static void main(String[] args) {
        int input = 30;

        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                if (i == j) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}