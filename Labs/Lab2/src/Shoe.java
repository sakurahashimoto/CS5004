/**
This class represents a shoe which has a kind, color, brand, and size.
 */
public class Shoe {

  private Kind kind;
  private Color color;
  private Brand brand;
  private double size;

  /**
  Check if the brand name is FUEGO and Kind are either BOOTS, LOAFER, SANDALS or if
  the brand name is Crocs and kind is LOAFER
  @throw IllegalArgumentException if the criteria above match
  Construct a Shoe object that has the provided kind, color, brand, and size

  @param kind the kind to be given to this shoe
  @param color the color to be given to this shoe
  @param brand the brand to be given to this shoe
  @param size the size to be assigned to this shoe

   */
  public Shoe(Kind kind, Color color, Brand brand, double size) {
    if (brand == Brand.FUEGO) {
      if (kind == Kind.BOOTS) {
        throw new IllegalArgumentException("Fuego does not sell boots.");
      }
      if (kind == Kind.LOAFER) {
        throw new IllegalArgumentException("Fuego does not sell loafers");
      }
      if (kind == Kind.SANDALS) {
        throw new IllegalArgumentException("Fuego does not sell sandals");
      }
    }

    if (brand == Brand.CROCS) {
      if (kind == Kind.LOAFER) {
        throw new IllegalArgumentException(("Crocs do not sell Loafers"));
      }
    }

    this.kind = kind;
    this.color = color;
    this.brand = brand;
    this.size = size;
  }

  /**
  Return a formatted string that contains information of this object. The string should be
  in the following format:
  Your shoe brand is [brand of the shoe], kind is [kind] ,color is [color], and the size is [size]

  @return the formatted string as above

  Check if the kind are the same as cases such as SNEAKER, LOAFER, SANDALS, etc if so asign string
  type of " ".
   */

  public String toString() {
    String kind = "";
    String color = "";
    String brand = "";
    switch(this.kind) {
      case SNEAKER -> kind = "Sneaker";
      case LOAFER -> kind = "Loafer";
      case SANDALS -> kind = "Sandals";
      case BOOTS -> kind = "Boots";
    }
    switch(this.brand) {
      case PUMA -> brand = "PUMA";
      case NIKE -> brand = "Nike";
      case FUEGO -> brand = "Fuego";
      case CROCS -> brand = "Crocs";
    }
    switch(this.color) {
      case RED -> color = "red";
      case PINK -> color = "pink";
      default -> color = this.color.toString();
    }

    return "Your shoe brand is " + brand + ", kind is " + kind + ", color is " + color
        + ", and the size is " + size;
  }

  /**
  Return the kind of this shoe
  @return the kind of this shoe
   */

  public Kind getKind() {
    return this.kind;
  }

  /**
  Return the color of this shoe
  @return the color of this shoe
   */

  public Color getColor() {
    return this.color;
  }

  /**
  Return the brand of this shoe
  @return the brand of this shoe
   */
  public Brand getBrand() {
    return this.brand;
  }

  /**Return the size of this shoe
  @return the size of this shoe
   */
  public double getSize() {
    return this.size;

  }
}
