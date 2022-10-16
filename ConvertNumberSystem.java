import java.util.Scanner;

class ConvertNumberSystem {
    public static void main(String[] args) {
        System.out.println("Please enter a decimal number.");
        Scanner input = new Scanner(System.in);
        int numberInput = input.nextInt();
        String binaryNumber = Integer.toBinaryString(numberInput);
        String octalNumber = Integer.toOctalString(numberInput);
        String hexNumber = Integer.toHexString(numberInput);
        System.out.println("The binary representation of " + numberInput + " is " + binaryNumber + ".\n The octal representation of " + numberInput + " is " + octalNumber + ". \n The hexadecimal representation of " + numberInput + " is " + hexNumber + ".");

        Scanner input_2 = new Scanner(System.in);
        System.out.println("Please enter an octal number.");
        int octalNumberInput = input_2.nextInt();
        if (Integer.toString(octalNumberInput).contains("8")) {
            System.out.println("Please enter a valid octal number.");
        }
        if (Integer.toString(octalNumberInput).contains("9")) {
            System.out.println("Please enter a valid octal number.");
            System.exit(0);
        }
        int decimalToOctal = Integer.parseInt(Integer.toString(octalNumberInput), 8);
        String binaryToOctal = Integer.toBinaryString(decimalToOctal);
        String hexToOctal = Integer.toHexString(decimalToOctal);
        String decimalToOctalString = Integer.toString(decimalToOctal);
        System.out.println("The binary representation of " + octalNumberInput + " is " + binaryToOctal + ". \n The decimal representation of " + octalNumberInput + " is " + decimalToOctalString + ". \n The hexadecimal representatino of " + octalNumberInput + " is " + hexToOctal + ".");
    }
}
