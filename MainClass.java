import java.time.Year;
import java.util.Scanner;

public class MainClass {
    int a, b, c = 2;

    public void setA(int i) {
        a = i;
    }

    public static void main(String[] args) {
        MainClass m = new MainClass();
        // m.testPrint();
        // m.testCast();
        // m.testArithmaticOperators();
        m.testLogicalOperators();
    }

    public void testPrint() {
        System.out.print("Enter a string : ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        System.out.println("String read from console is : \n" + inputString);
    }

    public void testCast() {
        double d = 2.8;
        int i = (int) Math.ceil(d);
        System.out.println("d = " + d + ", i = " + i);
    }

    public void testArithmaticOperators() {
        int x = 1;
        int y = x++ + 2;
        System.out.println("y = " + y);
    }

    public void testLogicalOperators() {
        int x = 1;
        int y = 2;
        System.out.println((x++ < 1 && ++y > 2) + ", x = " + x + ", y = " + y);
        x = 1;
        y = 2;
        System.out.println((x++ < 1 & ++y > 2) + ", x = " + x + ", y = " + y);
    }

    static public void test() {

    }

    public void test1() {

    }

    private void test1(int i, double d) {

    }

    protected void test1(double d, int i) {

    }
    public int test2() { return 1;}
    public void test2(int i) {}
    public int test2(double d) {return 1}
    public final int test2(float d) {return 1}

    public void test3() {}
    public int test3() { return 1;}
    public final int test3() {return 1;}
}

abstract class MainClass1 {
    abstract void test3();
}
