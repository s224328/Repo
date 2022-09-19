import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                int result;
                Scanner input = new Scanner(System.in);

                System.out.println("Write your first number:");
                int firstNumber = input.nextInt();

                System.out.println("Write your second number:");
                int secondNumber = input.nextInt();

                System.out.println("type + for addition, - for subtraction, * for multiplication or / to divide");
                String action = input.next();

                if (action.contains("+")) {
                    result = firstNumber + secondNumber;
                    System.out.println(result);
                }
                else if (action.contains("-")){
                    result = firstNumber - secondNumber;
                    System.out.println(result);
                }
                else if (action.contains("*")){
                    result = firstNumber * secondNumber;
                    System.out.println(result);
                }
                else if (action.contains("/")){
                    result = firstNumber / secondNumber;
                    System.out.println(result);
                }
            }
        }

