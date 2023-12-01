package trycatchexamples;

public class exceptionexample{  
  public static void main(String args[])
  {  
   try
   {  
        
      int data = 80 / 0 ;  
   }
   catch(ArithmeticException e)
   {
    System.out.println("ArithmeticException Error");
}  
   
   System.out.println("program is well clear");  
  }  
} 
