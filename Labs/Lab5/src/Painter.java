public class Painter extends VisualArtist {
  public Painter(String firstName, String lastName, int age, String[] genre, String[] exhibits)
      throws InvalidAgeException {
    super(firstName, lastName, age, genre,exhibits);
  }

  public void addExhibit(String exhibitName) {
    //make a new array of newExhibits with + 1 from the original
    String[] newExhibits = new String[this.exhibits.length + 1];
    //make a copy/moving process
    for (int i = 0; i < this.exhibits.length; i++) {
      newExhibits[i] = this.exhibits[i];
    }
    newExhibits[newExhibits.length -1]= exhibitName;
    this.exhibits = newExhibits;

  }



}
