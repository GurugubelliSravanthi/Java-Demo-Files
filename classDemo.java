import java.util.Scanner;

class Dolly {
  public void natural() {
    for (int i = 1; i <= 10; i++) {
      System.out.println(i);
    }
  }}
class Sravs extends Dolly {

  public void even() {
    for (int i = 1; i <= 50; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }
  }

}

class Tommy extends Sravs {
  int x;

  public void multi() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    x = sc.nextInt();
    for (int i = 1; i <= 10; i++) {
      System.out.println(x + "x" + i + "=" + x * i);
    }
  }
}

class mac extends Tommy {
  public void factori() {
    int fact = 6;
    int num = 1;
    for (int i = 1; i <= fact; i++) {
      num = num * i;
    }
    System.out.println(num);
  }
}
public class classDemo {
  public static void main(String[] args) {
    mac m = new mac();
    m.factori();
    m.even();
    m.multi();
    m.natural();
  }
}
