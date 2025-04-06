public class Demo {
  public static void main(String[] args) {
    int arr[]={8,3,7,4,2};
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }

    }
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
        
    }
  }
}

// i=0;j=1
// 8;3
// temp=8
// 3;8
// 0;2
// 8;7
// temp=8