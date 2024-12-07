class Dolliana {
  String name;

  public Dolliana() {
    System.out.println("hiii");
  }

  public  Dolliana(String name) {
    this.name = name;
    System.out.println("hello"+name);
  }
}
public class ConstructorDemo {
  public static void main(String[] args) {
    Dolliana obj = new Dolliana("sravs");

  }
}
