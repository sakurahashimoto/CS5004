public class Filmmaker extends MultimediaArtist{
  public Filmmaker(String firstName, String lastName, int age, String[] genre,
      String[] movies, String[] series, String[] otherMultimedia) throws InvalidAgeException {
    super(firstName, lastName, age, genre, movies, series, otherMultimedia);
  }
  public void directMovie(String movieTitle) {
    String[] newMovies = new String[this.movies.length + 1];
    for (int i = 0; i < this.movies.length; i++) {
      newMovies[i] = this.movies[i];
    }
    newMovies[newMovies.length -1 ] = movieTitle;
    this.movies = newMovies;
  }

}
