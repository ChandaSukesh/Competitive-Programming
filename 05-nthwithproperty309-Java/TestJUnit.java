/**
 * This is JUnit that tests the method that is available in NthWithProperty309 class.
 * This contains 3 testcases.
 * 
 * Please don't run this file.
 * You can add your own test cases to this file by just copy and paste the last three 
 * lines of the code (TestCase3).
 * 
 * @author: Siva Sankar
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJUnit {
   @Test
   public void testCase1() {
        assertEquals("1,", 309, new NthWithProperty309().nthWithProperty309(0));
        assertEquals("1,", 418, new NthWithProperty309().nthWithProperty309(1));
        assertEquals("1,", 462, new NthWithProperty309().nthWithProperty309(2));
        assertEquals("1,", 474, new NthWithProperty309().nthWithProperty309(3));

        assertEquals("1,", 575, new NthWithProperty309().nthWithProperty309(4));
        assertEquals("2,", 635, new NthWithProperty309().nthWithProperty309(5));
        assertEquals("3,", 662, new NthWithProperty309().nthWithProperty309(6));
        assertEquals("4,", 2014 , new NthWithProperty309().nthWithProperty309(100));
     //    assertEquals("1.", 7813, new NthWithProperty309().nthWithProperty309(1000));
   }
}
