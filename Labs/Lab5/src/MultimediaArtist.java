//all Actors,Dancers and Filmmakers keep track of the following
//information
public abstract class MultimediaArtist extends Artist{
  protected String[] movies;
  protected String[] series;
  protected String[] otherMultimedia;

  public MultimediaArtist(String firstName, String lastName, int age, String[] genre,
      String[] movies, String[] series, String[] otherMultimedia) throws InvalidAgeException {
    super(firstName, lastName, age, genre);
    this.movies = movies;
    this.series = series;
    this.otherMultimedia = otherMultimedia;

  }

}
