package trycatchexamples;

//multicatch example
public class Multicatchexample {

   public static void main(String[] args) {

      try {
         int a[] = new int[5];
         a[5] = 30 / 0;
      } catch (ArithmeticException e) {
         System.out.println("ArithmeticException  Error");
      } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("ArrayIndexOutOfBoundsException  Error");
      } catch (Exception e) {
         System.out.println("Parent Exception error");
      }
      System.out.println("program well clear");
   }
}
