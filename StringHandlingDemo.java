public class StringHandlingDemo {

    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";

        // Concatenate the two strings
        String fullName = firstName + " " + lastName;

        // Get the length of the full name
        int nameLength = fullName.length();

        System.out.println("The full name is: " + fullName);
        System.out.println("The length of the full name is: " + nameLength);
    }
}
