package practice;

 public class Demo3 

 {
	 
	 public static void main()
	 {
		 System.out.println("inside no arg main");
	 }
	 
	 public static void main(int x) 
	 {
		System.out.println("Inside int arg main");
		 
		 
	 }
	 
	 public static void main(double y)
	 {
		 System.out.println("inside double arg main");
	 }
	 
	 
	 public static void main(String[] args)
	 {
		 
		main(30);
		main();
		main(30.30);
		
		 
		 
		 
		 
	 }
	
	
	

}
