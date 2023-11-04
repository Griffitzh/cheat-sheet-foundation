package foundationstuff;

public class LambdaPerson {

    private String FirstName;

    private String LastName;

    private int age;

    public LambdaPerson(String FirstName, String LastName, int age) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.age = age;

    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public int getAge() {
        return age;
    }
}
