package GitPractice.Interviw;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveDuplicateFromString {

	public static String removeDuplicate(String str) {
	    char[] c = str.toCharArray();
	    String newStr = "";
	    for(int i=0; i<=c.length-1; i++){
	        if(!newStr.contains(c[i]+ ""))
	        newStr = newStr + c[i];
	    }
		return newStr;
	}
	

  @Test
  public void negativeTest() {
	  Assert.assertNotEquals("regression", removeDuplicate("regression"));
	  System.out.println("Negative Test Passed");
  }
  @Test
  public void posativeTest() {
	  Assert.assertEquals("regsion", removeDuplicate("regression"));
	  System.out.println("Posative Test Passed");
  }
}
