public class Photographer extends VisualArtist {
  public Photographer(String firstName, String lastName, int age, String[] genre, String[] exhibits)
      throws InvalidAgeException {
  super(firstName, lastName, age, genre, exhibits);
  }
  public void addPhotoExhibit(String photoExhibit) {
    String[] newPhotoExhibit = new String[this.exhibits.length + 1];
    for (int i = 0; i < this.exhibits.length; i++) {
      newPhotoExhibit[i] = this.exhibits[i];
    }
    newPhotoExhibit[newPhotoExhibit.length - 1] = photoExhibit;
    this.exhibits = newPhotoExhibit;

  }

}
