package practice;

public class SwapString {

	public static void main(String[] args) {
		
		
	String a = "Abdulla";
	String b = "Suhail";
	
	System.out.println("Before Swapping a: "+a);
	System.out.println("Before Swapping b: "+b);
	
	a = a+b; // AbdullaSuhail
	
	b = a.substring(0, a.length()-b.length()); // 
	a= a.substring(b.length());
	
	System.out.println("After Swapping a: "+a);
	System.out.println("After Swapping b: "+b);
	
	
	
	
	}

}
