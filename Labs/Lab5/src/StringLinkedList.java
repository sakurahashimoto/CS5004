public class StringLinkedList {
  private Node head;

  public StringLinkedList() {
    this.head = null;
  }

  public boolean isEmpty() {
    return this.head == null;
  }

  public int size() {
    int count = 0;
    //first step is from the head
    Node current = this.head;

    while (current != null) {
      count++;
      current = current.next;
    }
    return count;
  }

  public boolean contains(String s) {
    Node current = this.head;
    while (current != null) {
      if (current.data.equals(s)) {
        return true;
      }
      current = current.next;
    }
    return false;
  }

  public boolean containsAll(StringLinkedList other) {
    Node currentOther = other.head;
    while (currentOther != null) {

      if(this.contains(currentOther.data) == false) {
        return false;
      }
      currentOther = currentOther.next;
    }
    return true;
  }

  public StringLinkedList filterLargerThan(int n) {
    Node current = this.head;
    Node previous = null;

    while (current != null) {
      if (current.data.length() > n) {
        if (current == this.head) {
          this.head = current.next;
        } else {
          previous.next = current.next;
        }
        current = current.next;
      } else {
        previous = current;
        current = current.next;
      }
    }
    return this;
  }
  public boolean hasDuplicates() {
    Node p1 = this.head;

    while (p1 != null) {
      Node p2 = p1.next;
      while (p2 != null) {
        if (p1.data.equals(p2.data)) {
          return true;
        }
        p2 = p2.next;
      }
      p1 = p1.next;
    }
    return false;
  }
  public StringLinkedList removeDuplicates() {
    Node p1 = this.head;

    while (p1 != null) {
      Node previous = p1;
      Node p2 = p1.next;

      while (p2 != null) {
        if (p1.data.equals(p2.data)) {
          previous.next = p2.next;
          p2 = p2.next;
        } else {
          previous = p2;
          p2 = p2.next;
        }
      }
      p1 = p1.next;
    }
    return this;
  }














  }



