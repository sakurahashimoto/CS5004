public class Student {
  String firstName;
  String lastName;
  String studentID;
  String email;

  Student(String firstName, String lastName, String studentID, String email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.studentID = studentID;
    this.email = email;
  }
  @Override
  public String toString() {
    return "ID: " + studentID + " | Name: " + firstName + " " + lastName + " | Email: " + email;
  }

}
