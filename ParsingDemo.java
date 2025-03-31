public class ParsingDemo {
  public static void main(String[] args) {
    String num = "89";
    String donum = "89.53";
    String lonum = "896969";
    
    int n = Integer.parseInt(num);
    double m = Double.parseDouble(donum);
    long s = Long.parseLong(lonum);
    System.out.println(n);
  }
  
}
