
import java.util.Scanner;

public class reverseArr {
  public static void main(String[] args) {
      int arr[] = new int[5];
Scanner sc = new Scanner(System.in);
System.out.println("enter the elements");
for (int i = 0; i < arr.length; i++) {
  arr[i] = sc.nextInt();
}
System.out.println("the array before reversing");
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
System.out.println("the array after reversing");
  for (int i = arr.length-1; i >=0; i--) {
      System.out.println(arr[i]);
  }

  }
}

