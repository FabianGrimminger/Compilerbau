package de.dhbw.compiler.output;

public class test5
{
	
	static int a = read();
	
	public static int read(){
		return 0;
	}
  public static void main(String args[])
  {
	  
	  
    int x = 0;
    boolean read = "read"=="";
    
    
    double y = 0.0;
    int z = 0;
    
    while(x <= 4)
      {
        for(z=0;z <= 4;z=z+1)
          {
            x=x+2;
          }
        if(x == 4)
          {
            x=z*x+2;
            x=x+10;
          }else
          {
            y=100.e-3;
          }
      }
  }
 }
