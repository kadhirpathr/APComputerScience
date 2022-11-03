import java.util.Scanner;

class ConvertNumberSystem {
    public static void main(String[] args) {
        decimalToHex();
        decimalToOctal();
        decimalToBinary();
        hexToDecimal();
        octalToDecimal();
        binaryToDecimal();
    }

    static void decimalToHex() {
    System.out.println("Please enter a decimal number.");
    Scanner input = new Scanner(System.in);
    int decimalInputToHex = input.nextInt();
    String hexNumber = Integer.toHexString(decimalInputToHex);
    System.out.println("The hexadecimal representation of " + decimalInputToHex + " is " + hexNumber + ".");
    }
    
    static void decimalToOctal() {
        System.out.println("Please enter a decimal number.");
        Scanner input_2 = new Scanner(System.in);
        int decimalInputToOctal = input_2.nextInt();
        String decimalToOctal = Integer.toOctalString(decimalInputToOctal);
        System.out.println("The octal representation of " + decimalInputToOctal + " is " + decimalToOctal + ".");
    }

    static void decimalToBinary() {
        System.out.println("Please enter a decimal number.");
        Scanner input_3 = new Scanner(System.in);
        int decimalInputToBinary = input_3.nextInt();
        String decimalToBinary = Integer.toBinaryString(decimalInputToBinary);
        System.out.println("The binary representation of " + decimalInputToBinary + " is " + decimalToBinary + ".");
    }

    static void hexToDecimal() {
        System.out.println("Please enter a hexadecimal number.");
        Scanner hexInput = new Scanner(System.in);
        String hexInputToDecimal = hexInput.nextLine();
        String decimalToHex = Integer.toString(Integer.parseInt(hexInputToDecimal, 16));
        System.out.println("The decimal representation of the hex number " + hexInputToDecimal + " is " + decimalToHex + ".");
    }

    static void octalToDecimal() {
        System.out.println("Please enter an octal number.");
        Scanner octalInput = new Scanner(System.in);
        int octalInputToDecimal = octalInput.nextInt();
        if (Integer.toString(octalInputToDecimal).contains("8")) {
            System.out.println("Please enter a valid octal number.");
            System.exit(0);
        }
        if (Integer.toString(octalInputToDecimal).contains("9")) {
            System.out.println("Please enter a valid octal number.");
            System.exit(0);
        }
        int octalToDecimal = Integer.parseInt(Integer.toString(octalInputToDecimal), 8);
        System.out.println("The decimal representation of the octal number " + octalInputToDecimal + " is " + octalToDecimal + ".");
    }

    static void binaryToDecimal() {
        System.out.println("Please enter a binary number.");
        Scanner binaryInput = new Scanner(System.in);
        int binaryInputToDecimal = binaryInput.nextInt();
        if (Integer.toString(binaryInputToDecimal).contains("2")) {
            System.out.println("Please enter a valid binary number.");
            System.exit(0);
        }
        if (Integer.toString(binaryInputToDecimal).contains("3")) {
            System.out.println("Please enter a valid binary number.");
            System.exit(0);
        }
        if (Integer.toString(binaryInputToDecimal).contains("4")) {
            System.out.println("Please enter a valid binary number.");
            System.exit(0);
        }
        if (Integer.toString(binaryInputToDecimal).contains("5")) {
            System.out.println("Please enter a valid binary number.");
            System.exit(0);
        }
        if (Integer.toString(binaryInputToDecimal).contains("6")) {
            System.out.println("Please enter a valid binary number.");
            System.exit(0);
        }
        if (Integer.toString(binaryInputToDecimal).contains("7")) {
            System.out.println("Please enter a valid binary number.");
            System.exit(0);
        }
        if (Integer.toString(binaryInputToDecimal).contains("8")) {
            System.out.println("Please enter a valid binary number.");
            System.exit(0);
        }
        if (Integer.toString(binaryInputToDecimal).contains("9")) {
            System.out.println("Please enter a valid binary number.");
            System.exit(0);
        }

        int binaryToDecimal = Integer.parseInt(Integer.toString(binaryInputToDecimal), 2);
        System.out.println("The decimal representation of the binary number " + binaryInputToDecimal + " is " + binaryToDecimal + ".");

    }
}
