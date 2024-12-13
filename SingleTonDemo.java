class A {
  private static A a = new A();

  private A() {
    System.out.println("hihi");
  }

  public String str;
  public static A getsin() {
    // if (a == null) {
    //   a = new A();
    // }
    return a;
}
}
public class SingleTonDemo {
  public static void main(String[] args) {
    A dolly = A.getsin();
    // A sravs = A.getsin();
    // A oooo = A.getsin();
  }
  
}
