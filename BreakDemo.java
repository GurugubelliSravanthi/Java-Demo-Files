public class BreakDemo {
  public static void main(String[] args) {
    for (int i = 1; i <= 50; i++) {
      if (i % 2 == 0) {
        if (i == 26) {

          break;
        }
        if (i == 20) {
          continue;
        }
        System.out.println(i);
      }
    }
  }
}
