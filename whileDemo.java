import java.util.Scanner;
public class whileDemo {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int i=1;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
         String s=sc.nextLine();
         System.out.println(i+" "+s);
        i++;
        }
        
    }
}
