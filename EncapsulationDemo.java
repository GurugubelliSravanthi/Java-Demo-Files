class Gadgets {
  private String name;
  private int age;

  public String getName() {
    return name;
  }

  public int getage() {
    return age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setage(int age) {
    this.age = age;
  }
}

public class EncapsulationDemo {
  public static void main(String[] args) {
    Gadgets obj = new Gadgets();
    obj.setage(21);
    obj.setName("dollllllly");
    System.out.println(obj.getName());
    System.out.println(obj.getage());
  }
}