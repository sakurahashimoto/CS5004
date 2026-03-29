public class Program3 {
  public static <E> void printArray(E[] array) {
    for (E element : array) {
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
