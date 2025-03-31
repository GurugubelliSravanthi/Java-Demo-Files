import java.util.Scanner;

public class addarr {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int arr[] = new int[3];
        int arr1[] = new int[3];
        int arr2[] = new int[3];
        int arr3[] = new int[3];

        System.out.println("enter the frst elements");
        for (int i = 0; i < arr1.length; i++) {
          arr1[i] = sc.nextInt();
        }
       System.out.println("enter the scnd elements");

       for (int i = 0; i < arr2.length; i++) {
         arr2[i] = sc.nextInt();
       }
    System.out.println("ADDITION IS ");

    for (int i = 0; i < arr3.length; i++) {
      arr3[i] = arr1[i] + arr2[i];
    }
    for (int i = 0; i < arr3.length; i++) {
      System.out.println(arr3[i]);
    }








    //     int arr[] = new int[3];

    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("enter the  elements");
    //     for (int i = 0; i < arr.length; i++) {
    //       arr[i] = sc.nextInt();
    //     }
    //     System.out.println("enter the element to be searched");
    //     int k = sc.nextInt();
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i]==k) {
    //             System.out.println("yesss"+ (i+1));
    //           } 

    //     }
    int[] num = { 1, 2, 3, 4 };
    int sum = 0;
    for (int i = 0; i < num.length; i++) {
      sum += num[i];
    }
    System.out.println(sum);

  }
}

// array
// element to be searched - int
// [1,2,3]
// k=3
// i=0,
// i=1
// i=2
// k=3
