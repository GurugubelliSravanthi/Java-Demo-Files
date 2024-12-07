interface Dolmini {
  public void bliss();
}

class Helmin implements Dolmini {
  public void bliss() {
    System.out.println("fucked up");
  }
}
class gou implements Dolmini {
  public void bliss() {
    System.out.println("jerry");
  }
}

public class InterfaceDemo {
  public static void main(String[] args) {
    Dolmini obj = new Helmin();
    obj.bliss();
  }
  
}
