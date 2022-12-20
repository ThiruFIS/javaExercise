import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;

public class RevertStringTest {

        private static RevertString revertString;

        @BeforeClass
        public static void initClass() {
            revertString = new RevertString();
        }

        @Before
        public void beforeEachTest() {
            System.out.println("This is executed before each Test");
        }

        @After
        public void afterEachTest() {
            System.out.println("This is executed after each Test");
        }

        @Test
        public void testCase1() {
            String result = revertString.reverse("thiru");

            assertEquals("uriht", result);
        }

        @Test
        public void testCase2() {
            String result = revertString.reverse("1thiru");

            assertEquals("uriht1", result);
        }
}
