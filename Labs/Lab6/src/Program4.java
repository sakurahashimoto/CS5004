public class Program4 {
  public static Comparable getMax(Comparable[] array) {
    Comparable max = array[0];
    for (Comparable element : array) {
      if (element.compareTo(max) > 0) {
        max = element;
      }
    }
    return max;

  }
  public static void main(String[] args) {
    Integer[] intArray = {1, 2, 3, 4, 5};
    Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
    Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
    String[] strArray = {"once", "upon", "a", "time"};

    System.out.println("Max integer is " + getMax(intArray));
    System.out.println("Max double is  " + getMax(doubleArray));
    System.out.println("Max character is " + getMax(charArray));
    System.out.println("Max string is " + getMax(strArray));
  }

}
