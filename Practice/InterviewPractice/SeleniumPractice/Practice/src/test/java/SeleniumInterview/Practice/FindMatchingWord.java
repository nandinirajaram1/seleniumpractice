package SeleniumInterview.Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FindMatchingWord {
		public static void MatchingString() {
			String str = "Hello World";
			String []searchArray = {"hello", "world","sun","moon"}; 
			for(String s: searchArray) {
				if(str.toLowerCase().contains(s)) {
					System.out.println(s+":True");
				}
				else {
					System.out.println(s+":False");
				}
			}
		}
	  @Test
	  public void posativeTest() {
		  Assert.assertTrue(("hello world").contains("hello"));
	  }
	  @Test
	  public void negativeTest() {
		  Assert.assertFalse(("hello world").contains("sun"));
	  }
}
