public class Poet extends Artist{
  private String publishingCompany;
  private String lastPublishedCollection;

  public Poet(String firstName, String lastName, int age, String[] genre) throws InvalidAgeException {
    super(firstName, lastName, age, genre);
    this.publishingCompany = publishingCompany;
    this.lastPublishedCollection = lastPublishedCollection;
  }
  public void updateLastCollection(String newCollection) {
    this.lastPublishedCollection = newCollection;
  }

}
