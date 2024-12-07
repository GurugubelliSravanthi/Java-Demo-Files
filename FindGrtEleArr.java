public class FindGrtEleArr {
  public static void main(String[] args) {
  int arr[] = { 1, 4, 5, 2 };
    int grt = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (grt > arr[i]) {
        grt = arr[i];
      }
    }
  System.out.println(grt);
  }
}

