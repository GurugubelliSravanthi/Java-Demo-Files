class Counter {
  static int c=0;
  static {
    System.out.println("Static block");
}
  public Counter() {
    c++;
    System.out.println(c);
  }

  public static void meth() {
    System.out.println("Static method");
   }
  
}
public class StaticDemo {
  public static void main(String[] args) {
    Counter c = new Counter();
    Counter.meth();
    Counter c1 = new Counter();
    Counter c2 = new Counter();
  }
}
