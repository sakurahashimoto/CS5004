public class Actor extends MultimediaArtist{
  public Actor(String firstName, String lastName, int age, String[] genre, String[] movies,
      String[] series, String[] otherMultimedia) throws InvalidAgeException{
    super(firstName, lastName, age, genre, movies, series, otherMultimedia);

  }
  public void actIn(String movieTitle) {
    //making one bigger list than the original list
    //this.moview.length shows the number of movies in the list
    String[] newMovies = new String[this.movies.length + 1];
    //i = 0, this.movie[0] is copied to newMovies[0]
    for (int i = 0; i < this.movies.length; i++) {
      newMovies[i] = this.movies[i];
    }
    //add new movie title to the last index of newMovies[last index]
    newMovies[newMovies.length - 1] = movieTitle;
    //update this.movies
    this.movies = newMovies;
  }


}
