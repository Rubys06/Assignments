package examole;
import java.util.ArrayList;

public class Main {
	  
	    public static void main(String[] args)
		{
	        ArrayList<Integer> al =new ArrayList<>();
	        /*for(int i=0;i<=10;i++)
			{
	            al.add(i);
	        }*/
	        
	        al.add(1);
	        al.add(2);
	        al.add(3);
	        al.add(4);
	        al.add(2);
	        al.add(5);
	        
	        System.out.println(al);
			
	    for(int i=0;i<al.size();i++)
		{
			
	        for(int j=i+1;j<al.size();j++)
			{
	            if((al.get(i)).equals(al.get(j)))
				{
	                al.remove(j);
	            }
		    }
	        System.out.println(al.get(i));
		}
		}
	}	


