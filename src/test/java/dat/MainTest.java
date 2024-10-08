package dat;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MainTest {


    @BeforeAll
    static void setUpAll() {
    }

    @AfterAll
    public static void tearDown() {
    }

    @Test
    public void testPersistPackage() {
        int newInt = 1;
        int testInt = 1;
        assertEquals(testInt, newInt);
    }

}
