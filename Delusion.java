interface A {
  public void Area();
}

interface  B   {
  public void perimeter();
}

class C implements A,B {
  public void Area() {
    System.out.println("what");
  }

  public void perimeter() {
    System.out.println("peri");
  }
  
}

public class Delusion {
public static void main(String[] args) {
  C obj = new C();
  obj.Area();
  obj.perimeter();
}

  
}

