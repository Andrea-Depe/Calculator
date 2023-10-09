// Import the Scanner class from the java.util package
import java.util.Scanner;

// Define the Main class
public class Main {

    // Define the main method, the entry point of the Java application
    public static void main(String[] args) {
        // Initialize a new Scanner object to read user input from the console
        Scanner scanner = new Scanner(System.in);
        
        // Declare and initialize variables for storing numbers and the result
        float num1 = 0, num2 = 0, result = 0;
        
        // Declare and initialize a variable to control the loop
        String answer = "Y";
        
        // Display a welcome message and available operations
        System.out.println("Welcome to Calculator \n");
        System.out.println("This calculator allows you to perform + - * / % ");
        
        // Prompt the user to enter an operation or exit
        System.out.print("Enter the operation you want to perform, press N to exit");
        
        // Read the operation from the user
        String operation = scanner.nextLine();
        
        // Main loop for calculator operations
        while ("Y".equals(answer)) {

            try {
                // Switch statement to handle different operations
                switch (operation) {

                    // Addition case
                    case "+": {
                        // Prompt and read the first and second numbers
                        System.out.println("You have selected ADDITION\n");
                        System.out.println("Enter the first number");
                        num1 = Float.parseFloat(scanner.nextLine());
                        System.out.println("Enter the second number");
                        num2 = Float.parseFloat(scanner.nextLine());
                        
                        // Perform addition and display the result
                        result = num1 + num2;
                        System.out.println("Result: " + num1 + "+" + num2 + "=" + result + "\n");
                        
                        // Prompt for the next operation or exit
                        System.out.print("Enter the operation you want to perform, press N to exit");
                        operation = scanner.nextLine();
                        break;
                    }
                    // Other cases (Subtraction, Multiplication, etc.) follow the same pattern
                    // ... (omitted for brevity)

                    case "-": {
                        System.out.println("You have selected SUBTRACTION\n");
                        System.out.println("Enter the first number");

                        num1 = Float.parseFloat(scanner.nextLine());

                        System.out.println("Enter the second number");
                        num2 = Float.parseFloat(scanner.nextLine());

                        result = num1 - num2;
                        System.out.println("Result: " + num1 + "-" + num2 + "=" + result + "\n");
                        System.out.print("Enter the operation you want to perform, press N to exit");
                        operation = scanner.nextLine();
                        break;
                    }

                    case "*": {
                        System.out.println("You have selected MULTIPLICATION\n");
                        System.out.println("Enter the first number");

                        num1 = Float.parseFloat(scanner.nextLine());

                        System.out.println("Enter the second number");
                        num2 = Float.parseFloat(scanner.nextLine());

                        result = num1 * num2;
                        System.out.println("Result: " + num1 + "*" + num2 + "=" + result + "\n");
                        System.out.print("Enter the operation you want to perform, press N to exit");
                        operation = scanner.nextLine();
                        break;
                    }

                    case "/": {
                        System.out.println("You have selected DIVISION\n");
                        System.out.println("Enter the first number");

                        num1 = Float.parseFloat(scanner.nextLine());

                        System.out.println("Enter the second number");
                        num2 = Float.parseFloat(scanner.nextLine());
                        //division by 0 error management 
                        if (num2 != 0) {
                            result = num1 / num2;
                            System.out.println("Result: " + num1 + "/" + num2 + "=" + result + "\n");
                            System.out.print("Enter the operation you want to perform, press N to exit");
                            operation = scanner.nextLine();
                            break;
                        } else {
                            System.out.println("CANNOT DIVIDE BY 0");
                            break;
                        }
                    }

                    case "%": {
                        System.out.println("You have selected MODULO\n");
                        System.out.println("Enter the first number");

                        num1 = Float.parseFloat(scanner.nextLine());

                        System.out.println("Enter the second number");
                        num2 = Float.parseFloat(scanner.nextLine());

                        if (num2 != 0) {
                            result = num1 % num2;
                            System.out.println("Result: " + num1 + "%" + num2 + "=" + result + "\n");
                            System.out.print("Enter the operation you want to perform, press N to exit");
                            operation = scanner.nextLine();
                            break;
                        } else {
                            System.out.println("CANNOT DIVIDE BY 0");
                            break;
                        }
                    }
                    // case for exit from the calculator
                    case "N": {
                        System.out.println("Are you sure you want to exit? y/n");
                        operation = scanner.nextLine();
                        if (operation.equals("y")) {
                            answer = "N";
                            break;
                        }
                        	
                        	
                    }

                    // Default case for invalid operations
                    default: {
                        System.out.println("Error: You have selected an operation that does not exist");
                        System.out.println("This calculator allows you to perform + - * / % ");
                        System.out.print("Enter the operation you want to perform, press N to exit");
                        operation = scanner.nextLine();
                        break;
                    }
                }
            } catch (NumberFormatException e) {
                // Handle invalid number format
                System.out.println("Please enter a valid number.");
            }

        }
        scanner.close();
        // Display a message indicating the end of the program execution
        System.out.println("EXECUTION FINISHED"); 

    }
}





