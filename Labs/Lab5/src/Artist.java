public abstract class Artist {
 protected String firstName;
 protected String lastName;
 protected int age;
 protected String[] genre;
 protected String[] awards;

 public Artist(String firstName, String lastName, int age, String[] genre) throws InvalidAgeException{
  if (age < 0 || age > 128) {
   throw new InvalidAgeException("Age must be between 0 and 128");
  }
  this.firstName = firstName;
  this.lastName = lastName;
  this.age = age;
  this.genre = genre;
  this.awards = new String[0];
 }
 public void receiveAward(String award) {
  String[] newAward = new String[this.awards.length + 1 ];

  for (int i = 0; i < this.awards.length; i++) {
   newAward[i] = this.awards[i];
  }
  newAward[newAward.length - 1] = award;
  this.awards = newAward;
 }


}



