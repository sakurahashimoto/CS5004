/**
 * Represents a Book with their details--title, author and pages
 * @author Sakura
 */
public class Book {
  private String title;
  private String author;
  private Integer pages;

  /**
   Creates a new Book given the book's title, author and pages.
   * @param title the book's title
   * @param author the book's author
   * @param pages the number of pages in the book
   */
  public Book(String title, String author, Integer pages){
    this.title = title;
    this.author = author;
    this.pages = pages;
  }
  /**
   * @return the title
   */
  public String getTitle() {
    return this.title;
  }
  /**
   * @return the author
   */
  public String getAuthor() {
    return this.author;
  }
  /**
   * @return the number of pages in the book
   */
  public Integer getPages() {
    return this.pages;
  }




}
