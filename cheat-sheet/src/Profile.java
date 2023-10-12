
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Profile {
    protected int id;
    protected int age;
    protected String gender;
    protected String targetGender;
    protected int dailyLikeCounter;
    protected int maxDailyLike;
    protected List<Profile> likedProfiles;

    public Profile(int age, String gender, String targetGender, int maxDailyLike) {
        this.age = age;
        this.gender = gender;
        this.targetGender = targetGender;
        id = generateId();
        dailyLikeCounter = 0;
        this.maxDailyLike = maxDailyLike;
        likedProfiles = new ArrayList<>();
    }

    private int generateId() {
        String storeId = "";
        String[] possibleNumber = {"1", "2", "3", "4", "5"};

        for (int i = 0; i < 4; i++) {
            Random random = new Random();
            int randomIndex = random.nextInt(0, possibleNumber.length);
            String digit = possibleNumber[randomIndex];
            storeId += digit;
        }

        return Integer.parseInt(storeId);
    }

    public int getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public String getTargetGender() {
        return targetGender;
    }

    public List<Profile> getLikedProfiles() {
        return likedProfiles;
    }

    public abstract void sendMessage(Profile otherProfile);

    @Override
    public String toString() {
        return age + " year old " + gender + ", looking for a "
                + targetGender + ". (id: " + id + ")";
    }

    public void resetDailyLikeCounter() {
        dailyLikeCounter = 0;
    }
}
