import java.util.Scanner;

class HelloInput 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String printInput = input.nextLine();
        System.out.println("Hello " + printInput);
    }
}
