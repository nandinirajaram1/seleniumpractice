package Git.Practice;


import org.testng.Assert;
import org.testng.annotations.Test;

public class SumOfNumber {
	public int sumOfGivenInteger(int num) {
		int  temp,sum =0 ;
		while (num>0) {
			temp = num %10;
			sum = sum + temp;
			num=num/10;
		}
		return sum;
	}
  @Test
  public void posativeTest() {
	  Assert.assertEquals(10, sumOfGivenInteger(1234));
  }
  @Test
  public void negativeTest() {
	  Assert.assertNotEquals(1, sumOfGivenInteger(1234));
  }
  @Test
  public void singletInput() {
	  Assert.assertEquals(2,sumOfGivenInteger(2));
  }
}
