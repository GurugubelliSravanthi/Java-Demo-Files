public class InnerLoopsDemo {
  public static void main(String[] args) {
    String A = "aBcD";
    String C = "abcdabcd";
    int B = A.length();
    int c = 0;
    for (int i = 0; i < B; i++) {
      int v = A.charAt(i);
      for (int j = 0; j < C.length(); j++) {
        int f = C.charAt(j);
        if (v == f) {
          c += 1;
        }
      }

    }
    System.out.println(c);
  }
}
// 

// i=0,j=1,B,j=2;cj=3,;D
// i=1,j=2,cd
// j=3d

// i=0,j=0,1,2,3,4,5
// i=1,j=0,1,2,3,4,5
// i=2,j=01,2,3,4,5
