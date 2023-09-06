public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        int x = 10;
        int y = 0;

        try {
            // This code may throw an exception
            int z = x / y;
        } catch (ArithmeticException e) {
            // This code will be executed if the exception is thrown
            System.out.println("Division by zero error!");
        }

        System.out.println("Program terminated successfully!");
    }
}
