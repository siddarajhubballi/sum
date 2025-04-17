public class Sum {

    // Function to calculate the sum of two numbers
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    // Main function
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        int result = sum(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
    }
}
