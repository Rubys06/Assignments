package examole;

public class Immu {
	 
	    final String username;
	    final String password;
	    
	    public Immu(String username,String password){
	        this.username=username;
	        this.password=password;
	    }
	     
	     
	    public String getUsername(){
	        return username;
	    }
	    
	    public String password(){
	        return password;
	    }
		public static void main(String[] args) {
		    
			Immu mn = new Immu("ruby","123");
			System.out.println("username is:"+mn.getUsername());
			System.out.println("username is:"+mn.password());
		}
	}


