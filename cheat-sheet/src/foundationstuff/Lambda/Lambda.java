package foundationstuff.Lambda;

public class Lambda {
    //SHORTCUT for defining an implementation of a functional interface
    public static void main(String[] args) {
        Printable lambdaPrintable = animal -> "meow" + animal;
        printThing(lambdaPrintable);
    }

    static void printThing(Printable thing) {
        thing.print("dog");
    }
}
