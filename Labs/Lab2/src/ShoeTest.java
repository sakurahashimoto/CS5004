import static org.junit.jupiter.api.Assertions.*;

import java.util.function.Function;

/**
JUnit test class for Shoe
 */
class ShoeTest {

  @org.junit.jupiter.api.Test
  void testToString() {
    Shoe shoe = new Shoe(Kind.SNEAKER, Color.RED, Brand.NIKE, 6.5);
    String actual = shoe.toString();
    assertEquals("Your shoe brand is Nike, kind is Sneaker, color is red, and the size is 6.5",
        actual);

  }

  @org.junit.jupiter.api.Test
  void getKind() {
    Shoe shoe = new Shoe(Kind.SNEAKER, Color.BLACK, Brand.FUEGO, 6.5);
    Kind actual = shoe.getKind();
    assertEquals(Kind.SNEAKER, actual);
  }

  @org.junit.jupiter.api.Test
  void getColor() {
    Shoe shoe = new Shoe(Kind.BOOTS, Color.WHITE, Brand.NIKE, 6.5);
    Color actual = shoe.getColor();
    assertEquals(Color.WHITE, actual);
  }

  @org.junit.jupiter.api.Test
  void getBrand() {
    Shoe shoe = new Shoe(Kind.SANDALS, Color.RED, Brand.PUMA, 6.5);
    Brand actual = shoe.getBrand();
    assertEquals(Brand.PUMA, actual);
  }

  @org.junit.jupiter.api.Test
  void getSize() {
    Shoe shoe = new Shoe(Kind.SNEAKER, Color.BLACK, Brand.FUEGO, 6.5);
    double actual = shoe.getSize();
    assertEquals(6.5, actual);
  }

  @org.junit.jupiter.api.Test
  void throwOnInvalid() {
    IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class,
        () -> new Shoe(Kind.SANDALS, Color.BLACK, Brand.FUEGO, 6.5));
    assertEquals("Fuego does not sell sandals", thrown.getMessage());
  }
}