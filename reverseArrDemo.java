import java.util.Scanner;

public class reverseArrDemo {
  public static void main(String[] args) {
    int arr[] = new int[5];
    int rev[] = new int[5];
    int n = arr.length;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter ele");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    for (int i = 0; i < arr.length; i++) {
      rev[n - i - 1] = arr[i];

    }
    System.out.println("reverse of arr");
    for (int i = 0; i < arr.length; i++) {
      System.out.println(rev[i]);
    }
  }
  
}
