// abstract class SBI {
//   int amount;

//   abstract void deposit();

//   public void checkbal() {
//     System.out.println("salary is "+amount);
//   }
// }

// class User1 extends SBI {
//   public void deposit() {
//     // this.amount = 5000;

//   }
//   public User1() {
//     this.amount = 2000;
//   }
// }
// class User2 extends SBI{
//   public void deposit() {
//     this.amount = 10000;

//   }
// }

abstract class country {
  String c;

  abstract void addcoun();

  public void display() {
    System.out.println("the name is " + c);
  }
}

class india extends country {
  @Override
  public void addcoun() {
    this.c = "india";
  }
  
}

class pak extends country {
  @Override
  public void addcoun() {
    this.c = "pak";
  }
}

public class AbstractDemo {
  public static void main(String[] args) {
    // SBI obj = new User1();
    // // obj.User1();
    // obj.checkbal();
    country cs = new pak();
    cs.addcoun();
    cs.display();
  }
}
