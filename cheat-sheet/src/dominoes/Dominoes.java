package dominoes;

import java.util.ArrayList;
import java.util.List;
public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers
        // on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...
        System.out.println("original: " + dominoes);

        List<Domino> newOrder = new ArrayList<>();
        int orderIndex = 0;
        newOrder.add(dominoes.get(0));

        while (orderIndex < (dominoes.size()/2+2)) {
            for (int i = 1; i < dominoes.size(); i++) {
                if (newOrder.get(orderIndex).getRightSide() == dominoes.get(i).getLeftSide()) {
                    newOrder.add(orderIndex + 1, dominoes.get(i));
                    orderIndex ++;
                }
            }
        }
        //System.out.println(newOrder);
        dominoes.clear();
        dominoes.addAll(newOrder);
        System.out.println(dominoes);
    }
    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }
}