package trycatchexamples;

public class Nestedtryexample {

    public static void main(String args[]) {

        try {

            try {

                try {
                    int arr[] = { 1, 2, 3, 4 };

                    System.out.println(arr[10]);
                }

                catch (ArithmeticException e) {
                    System.out.println("ArithmeticException Error");
                    System.out.println(" inner try block 2");
                }
            }

            catch (ArithmeticException e) {
                System.out.println("ArithmeticException Error");
                System.out.println("inner try block 1");
            }
        }

        catch (ArrayIndexOutOfBoundsException e4) {
            System.out.print(e4);
            System.out.println("  main try block");
        } catch (Exception e5) {
            System.out.print("Exception");
            System.out.println(" handled in main try-block");
        }
    }
}