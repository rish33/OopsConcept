package functionOverloading;

public class MainOverloading {

		public static void main(String[] args)
		{System.out.println("main with String[]");} 
		
		//java only supports main with string[] args.
		
		public static void main(String args)
		{System.out.println("main with String");} 
		
		public static void main()	
		{System.out.println("main without args");}  
		 
}
