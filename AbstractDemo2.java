abstract class movies {
  String s;

  abstract void names();

  public void getmeth() {
    System.out.println("movie "+s);
  }
}

class eng extends movies {
  public void names() {
    this.s = "rrr";
  }
}

class tamil extends movies {
  String g;
  tamil(String con) {
    this.g = con;
  }
  public void names() {
    this.s = g;
  }
}
public class AbstractDemo2 {
  public static void main(String[] args) {
    movies m = new tamil("rrr");
    m.names();
    m.getmeth();
  }
}
