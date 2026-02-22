public class Dancer extends  MultimediaArtist{

  public Dancer(String firstName, String lastName, int age, String[] genre,
      String[] movies, String[] series, String[] otherMultimedia) throws InvalidAgeException {

    super(firstName, lastName, age, genre, movies, series,otherMultimedia);
  }
  public void danceIn(String showTitle) {
    String[] newOther = new String[this.otherMultimedia.length + 1];

    for (int i = 0; i < this.otherMultimedia.length; i++) {
      newOther[i] = this.otherMultimedia[i];
    }
    newOther[newOther.length - 1] = showTitle;
    this.otherMultimedia = newOther;
  }

}
