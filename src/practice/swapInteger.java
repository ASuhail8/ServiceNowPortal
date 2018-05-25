package practice;

public class swapInteger 
{

	public static void main(String[] args)
	
	{
		int x = 10;
		int y=  15;
		
		
	//using third variable t
		
		//int t=x;  // 10
		//x=y; // 15
		//y=t; //10
		
	//	System.out.println(x);
		//System.out.println(y);
		
		//without using 3rd varaible : using + operator
		
	//	x = x+y; //25
		//y = x-y ; //10
	//	x= x-y; //15
//		System.out.println(x);
	//	System.out.println(y);	
		
		//without using 3rd varaible : using * operator
		
		x = x*y ; 
	    y = x/y;
	    x = x/y;
	    System.out.println(x);
		System.out.println(y);	
		  
	}
	
}
