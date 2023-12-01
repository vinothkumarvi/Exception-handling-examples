package trycatchexamples;

//exception example
public class ExceptionPropagationExample {
    void my() {
        int data = 50 / 0;
    }

    void name() {
        my();
    }

    void pay() {
        try {
            name();
        } catch (Exception e) {
            System.out.println("exception is clear");
        }
    }

    public static void main(String args[]) {
        ExceptionPropagationExample obj = new ExceptionPropagationExample();
        obj.pay();
        System.out.println("program is well clear");
    }
}