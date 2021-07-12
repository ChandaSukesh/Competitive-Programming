/**
 * This is JUnit that tests the methods of the Clock.
 * This contains 2 testcases.
 * 
 * Please don't run this file.
 * You can add your own test cases to this file by just copy and 
 * paste the last three lines of the code (TestCase2).
 * 
 * @author: Deepak
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

// import java.beans.Transient;

public class TestJUnit {

   @Test
   public void testCase1() {
      MyMath s = new MyMath();
      assertEquals("1.", true, s.isFactor(2,2));
      assertEquals("2.", false, s.isFactor(2,5));
      assertEquals("3.", true, s.isFactor(2,4));
    }

   @Test
   public void testCase2() {
      MyMath s = new MyMath();
      assertEquals("1.", false, s.isFactor(0,6));
      assertEquals("2.", true, s.isFactor(6,0));
      assertEquals("3.", true, s.isFactor(0,0));
      assertEquals("4.", true, s.isFactor(-2,4));
   }  
}