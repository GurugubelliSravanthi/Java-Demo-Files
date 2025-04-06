

public class ExceptionDemo {
  public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();

    // try {
    //   int div = a / b;
    //   System.out.println(div);
    // } catch (ArithmeticException e) {
    //   System.out.println(e.getMessage());

    // } finally {
    //   System.out.println("done");

    // }
    Demooo dm = new Demooo();
    try {
        dm.check(7);
      } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
    }
  }
}

class Demooo {
  public void check(int age )throws ArithmeticException {
    if (age < 18) {
      throw new ArithmeticException("MINOR");
    } else {
      System.out.println("MAJOR");
    }
  }
 }


// try,except,else,finally ==py