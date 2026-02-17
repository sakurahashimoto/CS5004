public class EmptyNode implements IListOfBooks{
  @Override
  public int count() {
    return 0;
  }

  @Override
  public float totalPrice() {
    return 0;
  }
  @Override
  public  IListOfBooks allBefore(int year) {
    //no books before - year
    return new EmptyNode();
  }

  @Override
  public IListOfBooks addAtEnd(Book book) {
    EmptyNode empty = new EmptyNode();
    ElementNode newBook = new ElementNode(book, empty);
    return newBook;

  }

  @Override
  public String toString() {
    return "";

  }

}
