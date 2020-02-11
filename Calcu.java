package examole;

public class Calcu extends Exception{
	 
        
        public Calcu()
        {
            
        }
        public Calcu(String s) 
        {
            super(s);
        }
    
        public static int pow(int base, int power) throws Calcu
       {    
        int i, output;
        if( base<0 || power<0) 
         { 
          throw new Calcu("base or power not be negative");
         }
        
        output=base;
        
        for(i=1;i<power;i++)
        {
            output=output*base;
        }
        return output;

    }
}
