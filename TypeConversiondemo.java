public class TypeConversiondemo {
  public static void main(String[] args) {
    // int m = 80;
    char c = 'a';
    int m = (int) c;
    System.out.println(m);
  }
}
// left shift
// 5<<2=5*2^2  ==20
// 4<<3 = 4*2^3 ==32
// 2<<1 = 2*2^1 = 4

// right shift
// 5>>2 = 5/2^2 = 1
// 4>>3 = 4/2^3 = 0
// 64>>3 = 64/2^3 = 8