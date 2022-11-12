import java.util.Scanner;

class AreaOfPolygon {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int lengthOfSide, numberOfSides;

        System.out.println("Input the number of sides on the polygon: ");
        numberOfSides = input.nextInt();

        System.out.println("Input the length of the sides: ");
        lengthOfSide = input.nextInt();
        
        //Apothem = [(length of one side)/{2 ×(tan(180/number of sides))}].
        //Area = (number of sides × length of one side × apothem)/2
        /*A = (n/2) * L * R, where n is the number of sides in the polygon,
        L is the length of one side of the polygon,
        and R is the radius of an inscribed circle.*/
        float tanValue = (float)180/numberOfSides;
        float radius = (float)2*(float)Math.tan(tanValue);
        radius = (float)lengthOfSide/radius;

        float area = (float)numberOfSides/2;
        area = area * (float)lengthOfSide;
        area = area * radius;

        System.out.println("The area of the polygon is: " + area);
    }
}