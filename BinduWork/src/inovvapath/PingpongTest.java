package inovvapath;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PingpongTest {
	@Test
	  public void testDivisibleBy3() {
		  
		  String expected ="pong";
	     String actual = Pingpong.divisibleBy3(9);
	     Assert.assertEquals(expected,actual);
	    		  
	  }
	@Test
	public void testDivisibleBy5() {
		  
		  String expected ="ping";
	   String actual = Pingpong.divisibleBy3(10);
	   Assert.assertEquals(expected,actual);
	  		  
	}
	@Test
	public void testDivisibleBy5And3() {
		  
		  String expected ="ping pong";
	   String actual = Pingpong.divisibleBy3(15);
	   Assert.assertEquals(expected,actual);
	  		  
	}
}
