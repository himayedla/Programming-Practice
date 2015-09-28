package inovvapath;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PalindromeTest {
	@DataProvider(name="dataInput")
	public Object[][] datInput(){
		return new Object[][]{
				{"madam",true},
				{"Hai",false}
		};
	}
	@Test(dataProvider = "dataInput")
	public void testPalindrome(String str, boolean expected){
		boolean result = Palindrome.isPalindrome(str);
		Assert.assertTrue(result==expected, "Failed");
	}
}
