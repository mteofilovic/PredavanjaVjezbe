public class Klasa1 {

	public static void main(String[] args) {
	
       
		int a=7;
		int b=3;
		int c=2;
		
		if (a>5) {
			System.out.println("a");
			if (b>c) {
				System.out.println("b");
			}
			else
			{
				System.out.println("c");
			}
			
			
		}
		else if (a<5) {
			System.out.println("b");
			
			if (a>c)
			{
				System.out.println("a");
			}
			else 
			{
				System.out.println("c");
			}
		}
			else if (a==5) 
			{
			
				System.out.println("c");	
		}
		
		

	}

}
