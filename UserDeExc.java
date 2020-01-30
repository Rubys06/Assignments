package main;

public class UserDeExc {

	public static void main(String args[]) {
		
		int age=Integer.parseInt(args[0]);
		if(age>60)
		{
			throw new TooOldException("Too old for voting");
		}
		
		else if(age<18) {
			
			throw new TooYoungException("too young for voting");
		}
		else
		{
			System.out.println("eligble for voting");
		}
	}
	
}
class TooYoungException extends RuntimeException{
	TooYoungException(String str) {
		
		super(str);
	}	
}
class TooOldException extends RuntimeException{
	TooOldException(String str){
		super(str);
		
	}
	
}