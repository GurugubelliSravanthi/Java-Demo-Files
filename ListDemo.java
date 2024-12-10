
import java.util.Collections;
import java.util.LinkedList;

public class ListDemo {
  public static void main(String[] args) {
    // ArrayList<Integer> choco = new ArrayList<>();
    LinkedList<Integer> choco = new LinkedList<>();
    choco.add(1);
    choco.add(3);
    choco.add(5);
    System.out.println(choco);
    choco.add(2, 9);
    System.out.println(choco);
    choco.remove(3);
    System.out.println(choco);
    choco.set(0, 10);
     System.out.println(choco);
     System.out.println(choco.get(1));
     System.out.println(choco.size());
     System.out.println(choco.lastIndexOf(9));
     Collections.sort(choco);
     System.out.println(choco);
for(int t:choco)
{
  System.err.println(t);
}
















































































    }
}