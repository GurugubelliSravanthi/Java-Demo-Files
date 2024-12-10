// interface laptops
// class mac imp lap
// class dell impl lap
// fact clss-getlap
// main class obj of fac cls ,nd obj of lap cls

import java.util.Scanner;

interface laptop {
   
  int price();
}

class mac implements laptop {
 int macP = 2000;
  public int price() {
   return macP ;
  }
}

class dell implements laptop {
  int dellP = 1000;

  public int price() {
    return dellP;
  }
  
}

class lapFactory {
  public laptop getlap(String name) {
    if (name.equalsIgnoreCase("mac")) {
      return new mac();
    }else if(name.equalsIgnoreCase("dell")){
      return new dell();
    }else{
      return null;
    }
  }
}

public class FactDesignDemo {
  public static void main(String[] args) {
    lapFactory lf = new lapFactory();
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the laptop name (mac or dell)");
    String store = sc.nextLine();
    laptop lp = lf.getlap(store);
    System.out.println(lp.price());
  }
}