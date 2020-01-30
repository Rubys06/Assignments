package main;

public class Test1 {
	
	
	 public static void main(String args[]) {
	      int num1, num2;
	      try {
	         
	         num1 = 0;
	         num2 = 62 / num1;
	         System.out.println(num2);
	         System.out.println("end of try block");
	      }
	      catch (ArithmeticException e) { 
	         
	         System.out.println("divided a number by zero");
	      }
	      catch (Exception e) {
	         
	         System.out.println("Exception occurred");
	      }
	      System.out.println("out of try-catch block");
	   }
	}
	
	


