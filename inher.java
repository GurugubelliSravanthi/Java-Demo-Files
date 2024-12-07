

class Dance {
  public void steps() {
    System.out.println("learning");
  }

  public void natural() {
    int i = 1;
    while (i <= 100) {
      System.out.println(i);
      i++;
    }
    
    }
  }


class classical extends Dance {
  public void steps()
  {
    super.steps();
    System.out.println("dancing");
}}

public class inher {
  public static void main(String[] args) {

    Dance css = new classical();
    css.steps();
    css.natural();
   
  }
}
