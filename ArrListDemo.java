
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
    names.set(2, "hel");
    
    System.out.println(names);
    System.out.println(names.get(1));
    System.out.println(names.remove(1));
      System.out.println(names.size());

  }
}
