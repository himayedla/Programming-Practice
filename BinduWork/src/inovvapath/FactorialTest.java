package inovvapath;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class FactorialTest {
	
	@DataProvider(name="dataInput")
	public Object[][] datInput(){
		return new Object[][]{
				{1,1},
				{5,120}
		};
	}
	
	@Test(dataProvider = "dataInput")
	public void testFactorial(int input, double expected){
		double result = Factorial.factorial(input);
		Assert.assertTrue(result==expected, "Failed: expected value: "+expected+ " but got value: "+result);
	}
	
}
