package examole;
import java.util.Scanner; 


public class Ca {
	
	    public static void main(String[] args) 
	    { 
	    	Scanner input = new Scanner(System. in);
	    	System.out.println("Enter first integer: ");
	    	int num1 = input. nextInt();
	    	//Scanner input = new Scanner(System. in);
	    	System.out.println("Enter second integer: ");
	    	int num2 = input. nextInt();
	    	
	        Thir c = new Thir(num1,num2); 
	    } 
	} 
		class Hello
		{ 
		    public Hello(int j,int k) {  
		    	System.out.println(j*k);
		    	} 
		} 
		   
		class Secon extends Hello 
		{ 
		    public Secon(int j, int k) 
		    {super(j,k);
		    	System.out.println(j-k); 
		    	} 
		} 
		   
		class Thir extends Secon 
		{ 
		
		    public Thir(int j, int k)  
		    { super(j,k);
		    	System.out.println(j+k); 
		    	} 
		} 
		
		class Four extends Thir 
		{ 
		
		    public Four(int j, int k)  
		    { super(j,k);
		    	System.out.println(j/k); 
		    	} 
		} 
		   
