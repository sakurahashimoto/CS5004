//Painters and Photographers
public class VisualArtist extends Artist{
  String[] exhibits;

  public VisualArtist(String firstName, String lastName, int age, String[] genre, String[] exhibits)
  throws InvalidAgeException {
    super(firstName, lastName, age, genre);

    this.exhibits = exhibits;

  }

}
