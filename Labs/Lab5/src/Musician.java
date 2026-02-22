public class Musician extends Artist{
  private String recordingCompany;
  private String lastRecordAlbum;

  public Musician(String firstName, String lastName, int age, String[] genre,
      String recordingCompany, String lastRecordAlbum) throws InvalidAgeException {
      super(firstName, lastName, age, genre);
      this.recordingCompany = recordingCompany;
      this.lastRecordAlbum = lastRecordAlbum;
  }
  public void updateLastAlbum(String newAlbum) {
  this.lastRecordAlbum = newAlbum;
  }

}
