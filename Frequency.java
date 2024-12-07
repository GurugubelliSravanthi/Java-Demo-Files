public class Frequency {
  public static void main(String[] args) {
    String name = "centurion";
    int count=0;
    for (int i = 0; i < name.length(); i++) {
      // System.out.println(name.charAt(i));
      if (name.charAt(i) == 'n') {
        count++;
      }

    }
    System.out.println(count);
  }
}
