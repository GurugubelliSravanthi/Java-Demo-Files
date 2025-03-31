
import java.util.HashMap;

public class mapDemo {
  public static void main(String[] args) {
    HashMap<Character, Integer> dict = new HashMap<>();
    String sh = "TINA";
    dict.put('A', 1);
    dict.put('B', 2);
    dict.put('D', 1);
    dict.put('O', 1);
    dict.put('P', 1);
    dict.put('Q', 1);
    dict.put('R', 1);
    int s = 0;
    for (int i = 0; i < sh.length(); i++) {
      char c = sh.charAt(i);
      if (dict.containsKey(c)) {
        s += dict.get(c);
      }
    }
       System.out.println(s);
    // System.out.println(dict.get(2));
    // System.out.println(dict.remove(1));
    // System.out.println(dict.size());
    // System.out.println(dict.values());
    // System.out.println(dict.entrySet());
    // for (HashMap.Entry<Integer, String> e : dict.entrySet()) {
    // System.out.println(e.getKey()+" "+e.getValue());
    // }
  }
}
