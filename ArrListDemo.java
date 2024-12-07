
import java.util.ArrayList;
import java.util.Scanner;

public class ArrListDemo {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 3; i++) {
      String c = sc.nextLine();
      names.add(c);
    }
    System.out.println(names);
  }
}
