import java.util.Objects;
/**
 * A three-dimensional point class.
 **/
public class Point3d {
    /**
     * X coordinate of the point
     **/
    private double xCoord;
    /**
     * Y coordinate of the point
     **/
    private double yCoord;
    /**
     * Z coordinate of the point
     **/
    private double zCoord;
    /** Constructor to initialize point to (x, y, z) value. **/
    public Point3d(double x, double y,double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
    /** No-argument constructor:  defaults to a point at the origin. **/
    public Point3d() {
        // Call two-argument constructor and specify the origin.
        this(0, 0, 0);
    }
    /** Return the X coordinate of the point. **/
    public double getX() {
        return xCoord;
    }
    /** Return the Y coordinate of the point. **/
    public double getY() {
        return yCoord;
    }
    /** Return the Z coordinate of the point. **/
    public double getZ() {
        return zCoord;
    }
    /** Set the X coordinate of the point. **/
    public void setX(double val) {
        xCoord = val;
    }
    /** Set the Y coordinate of the point. **/
    public void setY(double val) {
        yCoord = val;
    }
    /** Set the Z coordinate of the point. **/
    public void setZ(double val) {
        zCoord = val;
    }
    public double distanceTo(Point3d p) {
        return Math.sqrt(Math.pow(this.xCoord - p.getX(), 2) + Math.pow(yCoord - p.getY(), 2) + Math.pow(zCoord - p.getZ(), 2));
    }
    public static double computeArea(Point3d a,Point3d b,Point3d c){
        double abDistance = a.distanceTo(b);
        double bcDistance = b.distanceTo(c);
        double caDistance = c.distanceTo(a);
        return heron(abDistance,bcDistance,caDistance);
    }
    public static double heron(double a,double b,double c){
        double s = (a + b + c) / 2;
        return Math.sqrt((s*(s-a) * (s-b)*(s-c)));
    }
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Point3d point3d = (Point3d) object;
        return Double.compare(point3d.xCoord, xCoord) == 0 &&
                Double.compare(point3d.yCoord, yCoord) == 0 &&
                Double.compare(point3d.zCoord, zCoord) == 0;
    }
    public int hashCode() {
        return Objects.hash(super.hashCode(), xCoord, yCoord, zCoord);
    }
}