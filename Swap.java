import java.util.Scanner;

class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, temp;

        System.out.println("Enter the first number: ");
        num1 = input.nextInt();

        System.out.println("Enter the second number: ");
        num2 = input.nextInt();

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("//s1 = " + num1 + "\n//s2 = " + num2);
    }
}