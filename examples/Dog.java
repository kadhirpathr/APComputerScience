
public class Dog {
    public String name;

    public Dog(String name) {
        // implement this
        this.name = name;
    }

    // implement getter and setter methods.
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Dog aDog = new Dog("Max");
        Dog oldDog = aDog;

        foo(aDog);
        boolean b = aDog.getName().equals("Max");
        System.out.print("," + b);
        b = aDog.getName().equals("Fifi");
        System.out.print("," + b);
        b = aDog == oldDog;
        System.out.println("," + b);
    }

    /*
     * public static void foo(Dog d) {
     * d.getName().equals("Max"); // true
     * d = new Dog("Fifi");
     * boolean b = d.getName().equals("Fifi");
     * System.out.print(b);
     * }
     */
    public static void foo(Dog d) {
        boolean b = d.getName().equals("Max");
        System.out.print(b);
        d.setName("Fifi");
    }
}
