import java.util.Scanner;

class ReverseAString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string to reverse: ");
        String string = input.nextLine();

        StringBuilder reverseString = new StringBuilder(string);
        reverseString = reverseString.reverse();
        string = reverseString.toString();

        System.out.println(string);
    }
}