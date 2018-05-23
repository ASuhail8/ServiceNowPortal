package practice;

public class RemoveJunk 
{

	
	public static void main(String[] args)
	{
		
		String s = "^$&@#&&&##^#& Selenium &#$&#&$& Training &$*$**$";
		String s1 = "&$*&#$*^$*^$*^$*^ Selenium";
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
		s1 = s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
		
	}
}
