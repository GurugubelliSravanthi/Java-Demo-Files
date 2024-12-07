import java.util.Scanner;

public class Arrint {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of an array");
    int n = sc.nextInt();
    // int arr[] = new int[n];
    String arr[] = new String[n];
    System.out.println("enter the elements");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextLine();
    }
    // for (int i = 0; i < arr.length; i++) {
    //   arr[i] = sc.nextInt();
    // }

    for (int i = 0; i <arr.length; i++) {
        System.out.println(arr[i]);
    }
  }
}