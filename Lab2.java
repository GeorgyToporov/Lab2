import java.io.*;
import java.util.Scanner;
/**
 * TODO
 */
public class Lab2 {

    public static Point3d inputPoint(Scanner scan){
        Point3d point3d = new Point3d();
        System.out.println("Enter x:= ");
        point3d.setX(getDouble(scan));
        System.out.println("Enter y:= ");
        point3d.setY(getDouble(scan));
        System.out.println("Enter z:= ");
        point3d.setZ(getDouble(scan));
        return point3d;
    }
    /**
     * Метод main
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first point");
        Point3d a = inputPoint(scan);

        System.out.println("Enter second point");
        Point3d b = inputPoint(scan);

        System.out.println("Enter third point");
        Point3d c = inputPoint(scan);

        double computeArea = Point3d.computeArea(a,b,c);

        System.out.println("Points compute area is " + computeArea);
        scan.close();

    }
    /**
     * Obtains one double-precision floating point number from
     * standard input.
     *
     * @return return the inputted double
     */
    public static double getDouble(Scanner scan) {
        while (!scan.hasNextDouble()) {
            System.out.println("Enter double please!Format is '44,33'");
            scan.nextLine();
        }
        return scan.nextDouble();
    }
}
