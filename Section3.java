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
        int add16 = 16;
        System.out.println("16 + 0 = " + add16);
        add16 +=1;
        System.out.println("16 + 1 = " + add16);
        add16 +=1;
        System.out.println("16 + 2 = " + add16);
        add16 +=1;
        System.out.println("16 + 3 = " + add16);
        add16 +=1;
        System.out.println("16 + 4 = " + add16);
        add16 +=1;
        System.out.println("16 + 5 = " + add16);
        add16 +=1;
        System.out.println("16 + 6 = " + add16);
        add16 +=1;
        System.out.println("16 + 7 = " + add16);
        add16 +=1;
        System.out.println("16 + 8 = " + add16);
        add16 +=1;
        System.out.println("16 + 9 = " + add16);
        add16 +=1;
        System.out.println("16 + 10 = " + add16);
        add16 +=1;
        System.out.println("16 + 11 = " + add16);
        add16 +=1;
        System.out.println("16 + 12 = " + add16);
        add16 +=1;
        System.out.println("16 + 13 = " + add16);
        add16 +=1;
        System.out.println("16 + 14 = " + add16);
        add16 +=1;
        System.out.println("16 + 15 = " + add16);
        add16 +=1;
        System.out.println("16 + 16 = " + add16);
    }

    static void multiplication16() {
        int times16 = 0;
        int counter = 0;
        System.out.println("16 * 0 = " + times16);
        counter += 1;
        times16 = 16*counter;
        System.out.println("16 * 1 = " + times16);
        counter += 1;
        times16 = 16*counter;
        System.out.println("16 * 2 = " + times16);
        counter += 1;
        times16 = 16*counter;
        System.out.println("16 * 3 = " + times16);
        counter += 1;
        times16 = 16*counter;
        System.out.println("16 * 4 = " + times16);
        counter += 1;
        times16 = 16*counter;
        System.out.println("16 * 5 = " + times16);
        counter += 1;
        times16 = 16*counter;
        System.out.println("16 * 6 = " + times16);
        counter += 1;
        times16 = 16*counter;
        System.out.println("16 * 7 = " + times16);
        counter += 1;
        times16 = 16*counter;
        System.out.println("16 * 8 = " + times16);
        counter += 1;
        times16 = 16*counter;
        System.out.println("16 * 9 = " + times16);
        counter += 1;
        times16 = 16*counter;
        System.out.println("16 * 10 = " + times16);
        counter += 1;
        times16 = 16*counter;
        System.out.println("16 * 11 = " + times16);
        counter += 1;
        times16 = 16*counter;
        System.out.println("16 * 12 = " + times16);
        counter += 1;
        times16 = 16*counter;
        System.out.println("16 * 13 = " + times16);
        counter += 1;
        times16 = 16*counter;
        System.out.println("16 * 14 = " + times16);
        counter += 1;
        times16 = 16*counter;
        System.out.println("16 * 15 = " + times16);
        counter += 1;
        times16 = 16*counter;
        System.out.println("16 * 16 = " + times16);
    }

    public static void main(String[] args) {
        assignment8();
        addition16();
        multiplication16();
    }
}