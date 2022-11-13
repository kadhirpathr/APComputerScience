import java.util.Scanner;

class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        double lat1, lat2, long1, long2, longDifference;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of the first latitude: ");
        lat1 = input.nextDouble();
        lat1 = lat1/(180/Math.PI);

        System.out.println("Enter the value of the first longitude: ");
        long1 = input.nextDouble();
        long1 = long1/(180/Math.PI);

        System.out.println("Enter the value of the second latitude: ");
        lat2 = input.nextDouble();
        lat2 = lat2/(180/Math.PI);

        System.out.println("Enter the value of the second longitude: ");
        long2 = input.nextDouble();
        long2 = long2/(180/Math.PI);

        longDifference = long2 - long1;
        //d = 3963.0 * arccos[(sin(lat1) * sin(lat2)) + cos(lat1) * cos(lat2) * cos(long2 – long1)]
        final float haversineRadius = (float)6378.8;
        float sinLat1, sinLat2, cosLat1, cosLat2, longCos, arccos, haversine;

        sinLat1 = (float)Math.sin(lat1);
        sinLat2 = (float)Math.sin(lat2);
        cosLat1 = (float)Math.cos(lat1);
        cosLat2 = (float)Math.cos(lat2);
        longCos = (float)Math.cos(longDifference);
        arccos = (float)Math.acos(sinLat1*sinLat2+cosLat1*cosLat2*longCos);
        haversine = haversineRadius*arccos;

        System.out.println("The distance between the two points is: " + haversine);
    }
}