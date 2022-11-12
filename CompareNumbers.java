import java.util.Scanner;

class CompareNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;

        System.out.println("Enter the first number: ");
        num1 = input.nextInt();

        System.out.println("Enter the second number: ");
        num2 = input.nextInt();

        if(num1 != num2) {
            System.out.println(num1 + " != " + num2);
            if (num1 < num2) {
                System.out.println(num1 + " < " + num2);
                System.out.println(num1 + " <= " + num2);
            }
            else {
                System.out.println(num2 + " < " + num1);
                System.out.println(num2 + " <= " + num1);                
            }
        }
        else {
            System.out.println(num1 + " = " + num2);
        }
    }
}