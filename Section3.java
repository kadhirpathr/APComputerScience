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

    static void addition16() {
        int x = 16;
        System.out.println("16 + 0 = " + x);
        x +=1;
        System.out.println("16 + 1 = " + x);
        x +=1;
        System.out.println("16 + 2 = " + x);
        x +=1;
        System.out.println("16 + 3 = " + x);
        x +=1;
        System.out.println("16 + 4 = " + x);
        x +=1;
        System.out.println("16 + 5 = " + x);
        x +=1;
        System.out.println("16 + 6 = " + x);
        x +=1;
        System.out.println("16 + 7 = " + x);
        x +=1;
        System.out.println("16 + 8 = " + x);
        x +=1;
        System.out.println("16 + 9 = " + x);
        x +=1;
        System.out.println("16 + 10 = " + x);
        x +=1;
        System.out.println("16 + 11 = " + x);
        x +=1;
        System.out.println("16 + 12 = " + x);
        x +=1;
        System.out.println("16 + 13 = " + x);
        x +=1;
        System.out.println("16 + 14 = " + x);
        x +=1;
        System.out.println("16 + 15 = " + x);
        x +=1;
        System.out.println("16 + 16 = " + x);
        x +=1;
    }

    public static void main(String[] args) {
        assignment8();
        addition16();
    }
}