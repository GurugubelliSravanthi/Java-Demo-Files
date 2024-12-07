
import java.util.InputMismatchException;

public class ExceptionDemo {
  public static void main(String[] args) {
    int a = 10;
    int b = 0;

    try {
        int div = a/b;
        System.out.println(div);
      } catch (ArithmeticException e) {
        System.out.println(e.getMessage());
    }catch (InputMismatchException e){
      System.out.println("mismatchhhhh");
    } finally{
      System.out.println("done");
    
    }
  }
}


// try,except,else,finally ==py