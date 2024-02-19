public class calciii {
    public static void main(String[] args) {
        // Predefined input values
        int num1 = 10;
        int num2 = 5;

        // Addition
        int sum = num1 + num2;
        System.out.println("Addition: " + sum);

        // Subtraction
        int difference = num1 - num2;
        System.out.println("Subtraction: " + difference);

        // Multiplication
        int product = num1 * num2;
        System.out.println("Multiplication: " + product);

        // Division
        if (num2 != 0) {
            double quotient = (double) num1 / num2;
            System.out.println("Division: " + quotient);
        } else {
            System.out.println("Division by zero is undefined.");
        }

        // Modulus
        int modulus = num1 % num2;
        System.out.println("Modulus: " + modulus);
    }
}
