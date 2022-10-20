import java.util.Scanner;

public class Section3 {
    static void assignment8() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number.");
        double num1 = input.nextInt();

        System.out.println("Enter the second number.");
        double num2 = input.nextInt();

        System.out.println("Enter the third number");
        double num3 = input.nextInt();

        double product = num1*num2*num3;

        System.out.println("The product of " + num1 + ", " + num2 + ", and " + num3 + " is " + product);
    }
    public static void main(String[] args) {
        assignment8();
    }
}