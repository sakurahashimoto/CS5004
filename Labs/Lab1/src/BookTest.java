import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookTest {
  private Book konan1;
  private Book konan2;
  private Book konan3;

  @BeforeEach
  void setUp() {
    this.konan1 = new Book("konan1", "Makoto", 100);
    this.konan2 = new Book("konan2", "Kent", 150);
    this.konan3 = new Book("konan3", "Sakura", 50);
  }

  @Test
  void getTitle() {
    Assertions.assertEquals("konan1", this.konan1.getTitle());
    Assertions.assertEquals("konan2",this.konan2.getTitle());
    Assertions.assertEquals("konan3",this.konan3.getTitle());

  }

  @Test
  void getAuthor() {
    Assertions.assertEquals("Makoto", this.konan1.getAuthor());
    Assertions.assertEquals("Kent", this.konan2.getAuthor());
    Assertions.assertEquals("Sakura", this.konan3.getAuthor());
  }

  @Test
  void getPages() {
    Assertions.assertEquals(100, this.konan1.getPages());
    Assertions.assertEquals(150, this.konan2.getPages());
    Assertions.assertEquals(50,this.konan3.getPages());
  }

}