import static org.junit.jupiter.api.Assertions.*;

class IListOfBooksTest {

  @org.junit.jupiter.api.Test
  void count() {
    Book book1 = new Book("ABC", "Tommy", 2026, 26.7F);
    Book book2 = new Book("DEF", "Sara",2020, 10.6F);
    Book book3 = new Book("GHI", "Sommer", 2022, 7.9F);

    IListOfBooks list = new EmptyNode();
    list = list.addAtEnd(book1);
    list = list.addAtEnd(book2);
    list = list.addAtEnd(book3);

    assertEquals(3,list.count());

  }

  @org.junit.jupiter.api.Test
  void totalPrice() {
    Book book1 = new Book("ABC", "Tommy", 2026, 26.7F);
    Book book2 = new Book("DEF", "Sara",2020, 10.6F);
    Book book3 = new Book("GHI", "Sommer", 2022, 7.9F);

    IListOfBooks list = new EmptyNode();
    list = list.addAtEnd(book1);
    list = list.addAtEnd(book2);
    list = list.addAtEnd(book3);
    double delta = 0.0001;

    assertEquals(45.2,list.totalPrice(),delta);


  }

  @org.junit.jupiter.api.Test
  void allBefore() {
    Book book1 = new Book("ABC", "Tommy", 2026, 26.7F);
    Book book2 = new Book("DEF", "Sara",2020, 10.6F);
    Book book3 = new Book("GHI", "Sommer", 2022, 7.9F);

    IListOfBooks list = new EmptyNode();
    list = list.addAtEnd(book1);
    list = list.addAtEnd(book2);
    list = list.addAtEnd(book3);

    assertEquals(1, list.allBefore(2021).count());
  }

  @org.junit.jupiter.api.Test
  void addAtEnd() {
    Book book1 = new Book("ABC", "Tommy", 2026, 26.7F);
    Book book2 = new Book("DEF", "Sara",2020, 10.6F);
    Book book3 = new Book("GHI", "Sommer", 2022, 7.9F);

    IListOfBooks list = new EmptyNode();
    list = list.addAtEnd(book1);
    list = list.addAtEnd(book2);
    list = list.addAtEnd(book3);

    assertEquals("{Title: ABC Author: Tommy Year: 2026 Price: 26.70}{Title: DEF Author: Sara Year: 2020 Price: 10.60}{Title: GHI Author: Sommer Year: 2022 Price: 7.90}", list.toString());




  }

  @org.junit.jupiter.api.Test
  void testToString() {
    Book book = new Book("A", "Saku",2020, 10.0F);
    IListOfBooks list = new EmptyNode();
    list = list.addAtEnd(book);

    assertEquals("{Title: A Author: Saku Year: 2020 Price: 10.00}", list.toString());


  }
}