import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PremiumTest {

    @Test
    void Test1() {
        Premium premium = new Premium("Male", -5);
        assertEquals(-1,premium.calPremium());
    }
    @Test
    void Test2() {
        Premium premium = new Premium("Male", 3);
        assertEquals(1.5,premium.calPremium());
    }
    @Test
    void Test3() {
        Premium premium = new Premium("Male", 9);
        assertEquals(1.8,premium.calPremium());
    }
    @Test
    void Test4() {
        Premium premium = new Premium("Male", 15);
        assertEquals(2,premium.calPremium());
    }
    @Test
    void Test5() {
        Premium premium = new Premium("Male", 40);
        assertEquals(3,premium.calPremium());
    }
    @Test
    void Test6() {
        Premium premium = new Premium("Female", 150);
        assertEquals(-1,premium.calPremium());
    }
    @Test
    void Test7() {
        Premium premium = new Premium("Female", 4);
        assertEquals(1.2,premium.calPremium());
    }
    @Test
    void Test8() {
        Premium premium = new Premium("Female", 10);
        assertEquals(1.5,premium.calPremium());
    }
    @Test
    void Test9() {
        Premium premium = new Premium("Female", 16);
        assertEquals(1.8,premium.calPremium());
    }
    @Test
    void Test10() {
        Premium premium = new Premium("Female", 30);
        assertEquals(2.5,premium.calPremium());
    }

}

