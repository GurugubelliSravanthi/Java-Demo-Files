import java.util.Scanner;

public class ArraySearch {
  public static void main(String[] args) {
      int arr[] = new int[3];   
      Scanner s = new Scanner(System.in);
      System.out.println("enter the elements");
      for (int i = 0; i < arr.length; i++) {
        arr[i] = s.nextInt();
      }
      System.out.println("enter the elements to be searched");
      int m = s.nextInt();
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] == m) {
            System.out.println((i+1));
          }
          
      }
  }

  

}
