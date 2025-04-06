public class FindSmallArrEle {
  public static void main(String[] args) {
    int[] arr = {  2,1,8, 3, 4, 5 };
    int small = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (small > arr[i]) {
        small = arr[i];
      }
    }
    System.out.println(small)
    ;
  }
}
