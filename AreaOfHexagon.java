import java.util.Scanner;

class AreaOfHexagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sideLength;

        System.out.println("Enter the side length of a regular hexagon: ");
        sideLength = input.nextInt();

        float area = (3*(float)Math.pow(3, .5))/2;
        area = area*(float)Math.pow(sideLength, 2);
        System.out.println("The area of a regular hexagon with the side length of " + sideLength + " is " + area);
    }
}