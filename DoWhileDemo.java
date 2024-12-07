
import java.util.Scanner;

public class DoWhileDemo {
  public static void main(String[] args) {
    int ch;
    do{
      Scanner sc = new Scanner(System.in);
      
      System.out.println("enter 1 for hi");
      System.out.println("enter 2 for bye");
      System.out.println("enter 3 for stopping");
      System.out.println("enter ur choice");
      ch=sc.nextInt();
      switch(ch){
        case 1:System.out.println("hi");
        break;
        case 2:System.out.println("hlo");
        break;
        case 3:System.out.println("bye");
        default:
        System.out.println("stop");
        }
    }
    while(ch!=3);

    
}
}
