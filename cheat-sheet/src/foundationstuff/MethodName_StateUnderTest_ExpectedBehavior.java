package foundationstuff;

import foundationstuff.Anagram;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MethodName_StateUnderTest_ExpectedBehavior {

    Anagram anagram;

    //create new Class INSTANCE BEFORE EVERY TEST
    @BeforeEach
    void setup() {
        anagram = new Anagram();
    }

    //TEST DOESNT WORK WITHOUT AN ASSERT METHOD!
    @Test
    @DisplayName("myMethodName width random numbers should return false")
    public void myMethodName_WithRandomNumbers_ShouldReturnFalse() {
        //ASSERT ACTION
    }
}
