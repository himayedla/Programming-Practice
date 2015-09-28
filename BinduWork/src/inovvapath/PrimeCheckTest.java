package inovvapath;
import org.testng.Assert;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class PrimeCheckTest {
	 @Test
	  public void testIsPrime() {
		  
	    boolean expected = true;
	    int number = 7;
	    boolean actual = PrimeCheck.isPrime(number);
	    Assert.assertEquals(actual, expected);
	  }
}
