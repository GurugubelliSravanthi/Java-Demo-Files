
public class StringMethods {
public static void main(String[] args) {
  String s = "hello java";
  String ss = "Hello Java";
  String subs1 = s.substring(0, 1);
  String subs2 = s.substring(6, 7);
 String A= subs1.toUpperCase()+s.substring(1,5);
 String B=subs2.toUpperCase()+s.substring(7,10);
  System.out.print(A+" "+B);
  System.out.println(s.substring(3, 7));
  System.out.println(s.substring(4));
  System.out.println(s.toUpperCase());
  System.out.println(s.toLowerCase());
  System.out.println(s.charAt(3));
  System.out.println(s.equals(ss));
  System.out.println(s.equalsIgnoreCase(ss));
  System.out.println(ss.compareTo(s));
  System.out.println(ss.compareToIgnoreCase(s));

  System.out.println(s.contains("java"));
  System.out.println(s.indexOf("h"));
  System.out.println(s.endsWith("v"));
  System.out.println(s.startsWith("h"));
  System.out.println(ss.trim());
  System.out.println(s.replace("h", "z"));

  int N = 123;
  System.out.println(String.valueOf(N));
  System.out.println(Integer.toString(N));
}
}
