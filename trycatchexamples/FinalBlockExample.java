package trycatchexamples;

// final example
public class FinalBlockExample {
    public static void main(String args[]) {
        try {
            
            int data = 25 / 5;
            System.out.println(data);
        }
        
        catch (NullPointerException e) {
            System.out.println(e);
        }
       
        finally 
        {
            System.out.println("all clear");
        }

        System.out.println("program is well clear");
    }
}
