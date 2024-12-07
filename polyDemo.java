class overload {

  String st;

  public void meth() {
    System.out.println("over loading");
  }

  public void meth(String st) {
    this.st = st;
    System.out.println(st);
  }
}

class override extends overload{
  public void meth() {
    System.out.println("overrding");
  }
}

public class polyDemo {
  public static void main(String[] args) {
    overload oo = new overload();
    oo.meth("df");
    oo.meth();
  }
}
