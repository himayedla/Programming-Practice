package inovvapath;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class SwapTest {
	
	@DataProvider(name="dataInput")
	public Object[][] datInput(){
		return new Object[][]{
				{2,3},
				{5,6}
		};
	}
  
	@Test(dataProvider = "dataInput")
	public void f(int a, int b) {
	  Swap swap = new Swap(a, b);
	  swap.swapTest();
	  Assert.assertTrue((swap.a==b && swap.b ==a), "Failed");
  }
}
