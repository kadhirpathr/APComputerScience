import java.util.Scanner;

class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        
        System.out.println("Input the first number: ");
        num1 = input.nextInt();

        System.out.println("Input the second number: ");
        num2 = input.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double quotient = num1/num2;
        int mod = num1%num2;

        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + difference);
        System.out.println(num1 + " * " + num2 + " = " + product);
        System.out.println(num1 + " / " + num2 + " = " + quotient);
        System.out.println(num1 + " mod " + num2 + " = " + mod);
    }
}