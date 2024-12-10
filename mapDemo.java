
import java.util.HashMap;

public class mapDemo {
  public static void main(String[] args) {
    HashMap<Integer, String> dict = new HashMap<>();
    dict.put(1, "hash");
    dict.put(2, "linked");
    dict.put(3, "map");
    System.out.println(dict.get(2));
    System.out.println(dict.remove(1));
    System.out.println(dict.size());
    System.out.println(dict.values());
    System.out.println(dict.entrySet());
    for (HashMap.Entry<Integer, String> e : dict.entrySet()) {
      System.out.println(e.getKey()+" "+e.getValue());
    }
  }
}
