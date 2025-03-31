class OuterClass {
  class InnerClass {
    public void meth() {
      System.out.println("inner class meth");
    }
  }

  public void meth2() {
    System.out.println("outer class meth");
  }

  static class staticClass {
    public void hel() {
      System.out.println("static cls");
    }
  }
}


public class InnerClassesDemo {
  public static void main(String[] args) {
    OuterClass oc = new OuterClass();
    OuterClass.InnerClass ic = oc.new InnerClass();
    ic.meth();
    OuterClass.staticClass ss = new OuterClass.staticClass();
    ss.hel();
  }
}
