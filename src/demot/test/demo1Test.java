package demot.test;
// Generated by ComTest BEGIN
import static org.junit.Assert.*;
import org.junit.*;
import static demot.demo1.*;
// Generated by ComTest END

/**
 * Test class made by ComTest
 * @version 2022.11.09 21:26:46 // Generated by ComTest
 *
 */
@SuppressWarnings({ "all" })
public class demo1Test {



  // Generated by ComTest BEGIN
  /** testMontakoEsiintymaa20 */
  @Test
  public void testMontakoEsiintymaa20() {    // demo1: 20
    int[] t = new int[]{ 1, 2, 3, 4, 5} ; 
    assertEquals("From: demo1 line: 22", 5, montakoEsiintymaa(t, 1)); 
    assertEquals("From: demo1 line: 23", 2, montakoEsiintymaa(t, 2)); 
    assertEquals("From: demo1 line: 24", 1, montakoEsiintymaa(t, 3)); 
    assertEquals("From: demo1 line: 25", -1, montakoEsiintymaa(t, 0)); 
    int[] t1 = new int[0]; 
    assertEquals("From: demo1 line: 27", -1, montakoEsiintymaa(t1, 3)); 
  } // Generated by ComTest END
}