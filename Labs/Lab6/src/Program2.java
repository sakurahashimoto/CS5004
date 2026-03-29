public class Program2 {
  public static void printArray(Integer[] array) {
    for (Integer element : array) {
      System.out.print(element + " ");
    }
    System.out.println();
  }
  public static void printArray(Double[] array) {
    for (Double element : array) {
      System.out.print(element + " ");
    }
    System.out.println();
  }
  public static void printArray(Character[] array) {
    for (Character element : array) {
      System.out.print(element + " ");
    }
    System.out.println();
  }
  public static void printArray(String[] array) {
    for (String element : array) {
      System.out.print(element + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Integer[] intArray = {1, 2, 3, 4, 5};
    Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
    Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
    String[] strArray = {"once", "upon", "a", "time"};

    printArray(intArray);
    printArray(doubleArray);
    printArray(charArray);
    printArray(strArray);
  }



}
