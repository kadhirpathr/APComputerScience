import java.util.Scanner;

class SwapWithoutTemp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;

        System.out.println("Enter the first number: ");
        num1 = input.nextInt();
        
        System.out.println("Enter the second number: ");
        num2 = input.nextInt();

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("The value of the first number is now " + num1 + ".\n The value of the second number is now " + num2 + ".");
    }
}