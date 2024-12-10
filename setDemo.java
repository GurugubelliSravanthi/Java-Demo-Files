
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class setDemo {
  public static void main(String[] args) {
    // HashSet<String> lan = new HashSet<>();
    // TreeSet<String> lan = new TreeSet<>();
    LinkedHashSet<String> lan = new LinkedHashSet<>();
    lan.add("java");
    lan.add("python");
    lan.add("spring");
    System.out.println(lan);
    System.out.println(lan.isEmpty());
    System.out.println(lan.remove("python"));
    System.out.println(lan.contains("java"));
    System.out.println(lan.size());
    System.out.println(lan);
    for (String s : lan) {
      System.out.println(s);
    }
    

  }
}
