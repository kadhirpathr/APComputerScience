import java.util.Scanner;

class Average5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3, num4, num5;

        System.out.println("Enter the first number: ");
        num1 = input.nextInt();

        System.out.println("Enter the second number: ");
        num2 = input.nextInt();

        System.out.println("Enter the third number: ");
        num3 = input.nextInt();

        System.out.println("Enter the fourth number: ");
        num4 = input.nextInt();

        System.out.println("Enter the fifth number: ");
        num5 = input.nextInt();

        double average = (num1 + num2 + num3 + num4 + num5)/5;
        System.out.println("The average of the five numbers is: " + average);
    }
}