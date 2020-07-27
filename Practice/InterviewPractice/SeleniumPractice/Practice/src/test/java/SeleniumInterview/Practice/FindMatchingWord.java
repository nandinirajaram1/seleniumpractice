package SeleniumInterview.Practice;

public class FindMatchingWord {
	public static void main(String[] args) {
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
}
