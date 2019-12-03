import java.util.Scanner;
public class Calculator {
    public static void main(String args []) {
        Scanner user = new Scanner (System.in); //Scanner = user b/c user is keyboard input
        double operand1, operand2, result = 0;
        int userOp;

        System.out.print("Enter first operand: ");
            operand1 = user.nextDouble();
        System.out.print("Enter second operand: ");
            operand2 = user.nextDouble(); //"d" in double has to be capitalized
        System.out.println("Calculator Menu");
        System.out.println("---------------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Which operation do you want to perform? ");
            userOp = user.nextInt(); //userOp = "User Operation"
                if (userOp == 1) {
                    result = operand1 + operand2;
                    System.out.print("The result of the operation is " + result + ". Goodbye!");
                }
                else if (userOp == 2) {
                   result = operand1 - operand2;
                    System.out.print("The result of the operation is " + result + ". Goodbye!");
                }
                else if (userOp == 3) {
                    result = operand1 * operand2;
                    System.out.print("The result of the operation is " + result + ". Goodbye!");
                }
                else if (userOp == 4) {
                    result = operand1 / operand2;
                    System.out.print("The result of the operation is " + result + ". Goodbye!");
                }
                else {
                    System.out.print("Error: Invalid selection! Terminating program.");
                }
    }
}
