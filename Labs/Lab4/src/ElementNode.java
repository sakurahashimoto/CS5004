public class ElementNode implements IListOfBooks{
  Book book;
  IListOfBooks next;

  ElementNode(Book book, IListOfBooks next) {
    this.book = book;
    this.next = next;
  }


  @Override
  public int count() {
    return 1 + next.count();
  }

  @Override
  public float totalPrice() {
    return book.getPrice() + next.totalPrice();
  }

  @Override
  public IListOfBooks allBefore(int year) {
    if (book.getYear() < year) {
      return new ElementNode(this.book, next.allBefore(year));
    }
    return next.allBefore(year);

  }

  @Override
  public IListOfBooks addAtEnd(Book book) {
   if (next.count() != 0) {
     return new ElementNode(this.book, next.addAtEnd(book));
   }
   EmptyNode empty =  new EmptyNode();
   ElementNode last = new ElementNode(book, empty);
   return new ElementNode(this.book, last);

  }

  @Override
  public String toString() {
    return "{" + this.book.toString() + "}" + next.toString();

  }

}
