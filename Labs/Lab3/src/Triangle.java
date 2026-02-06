/**
 * This class represents a Triangle.  It defines all the operations mandated by the Shape
 * interface
 */
public class Triangle extends AbstractShape {

  private Point2D point2;
  private Point2D point3;


  /**
   * Constructs a triangle object with the given location of three points
   *
   * @param x1 x1 reference point of x1 of a triangle
   * @param y1 y1 reference point of y1 of a triangle
   * @param x2 x2 the second point of x2 of a triangle
   * @param y2 y2 the second point of y2 of a triangle
   * @param x3 x3 the third point of x3 of a triangle
   * @param y3 y3 the third point of y3 of a triangle
   */
  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
    super(new Point2D(x1, y1));
    if (x1 == x2 && y1 == y2 || x2 == x3 && y2 == y3 || x1 == x3 && y1 == y3) {
      throw new IllegalArgumentException(
          "Triangle with two (or three) identical points cannot be constructed");
    }
    this.point2 = new Point2D(x2, y2);
    this.point3 = new Point2D(x3, y3);
  }

  /**
   * The area method returns Math.sqrt(s * (s - a) * (s - b) * (s - c))
   * @return the calculated area for a triangle
   */

  @Override
  public double area() {
    double s;
    double a;
    double b;
    double c;
    s = perimeter() / 2;
    a = calculateDistance(this.reference, this.point2);
    b = calculateDistance(this.reference, this.point3);
    c = calculateDistance(this.point3, this.point2);

    return Math.sqrt(s * (s - a) * (s - b) * (s - c));

  }

  /**
   * The perimeter method returns the perimeter of a triangle
   * @return the calculated perimeter for a triangle
   */

  @Override
  public double perimeter() {
    //System.out.printf("ref p2 = %f%n", calculateDistance(this.reference, this.point2));
    //System.out.printf("ref p3 = %f%n", calculateDistance(this.reference, this.point3));
    //System.out.printf("p3 p2 = %f%n", calculateDistance(this.point3, this.point2));
    return calculateDistance(this.reference, this.point2) + calculateDistance(this.reference,
        this.point3) +
        calculateDistance(this.point3, this.point2);
  }

  /**
   * The calculateDistance method returns the distance from poit a to b
   * @param a a parameter for a point of a triangle
   * @param b b a parameter for a point of a triangle
   * @return returns the calculated distance from a to b
   */
  private double calculateDistance(Point2D a, Point2D b) {
    return Math.sqrt(Math.pow((b.getX() - a.getX()), 2) + Math.pow((b.getY() - a.getY()), 2));
  }

  /**
   * The resize method returns a resized new triangle
   * @param factor factor of resizing
   * @return a factored triangle
   */
  @Override
  public Shape resize(double factor) {
    double sqfactor = Math.sqrt(factor);
    return new Triangle(this.reference.getX(), this.reference.getY(), sqfactor * this.point2.getX(),
        sqfactor * this.point2.getY(), sqfactor * this.point3.getX(), sqfactor * this.point3.getY());


  }

  /**
   * toString method returns formatted string "Triangle: reference (%.3f,%.3f) second point (%.3f,%.3f)  third point (%.3f,%.3f)"
   * @return returns formatted string
   */
  public String toString() {
    return String.format(
        "Triangle: reference (%.3f,%.3f) second point (%.3f,%.3f)  third point (%.3f,%.3f)",
        this.reference.getX(), this.reference.getY(), this.point2.getX(), this.point2.getY(),
        this.point3.getX(), this.point3.getY());
  }
}
