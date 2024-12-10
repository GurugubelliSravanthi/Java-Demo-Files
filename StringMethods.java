
public class StringMethods {
public static void main(String[] args) {
  String s = "hello java";
  String ss = "Hello Java";
  String subs1 = s.substring(0, 1); //h
  String subs2 = s.substring(6, 7);//j
 String A= subs1.toUpperCase()+s.substring(1,5);//Hello
 String B=subs2.toUpperCase()+s.substring(7,10);//Java
  System.out.print(A+" "+B);//Hello Java
  System.out.println(s.substring(3, 7));//lo j
  System.out.println(s.substring(4));//java
  System.out.println(s.toUpperCase());//HELLO JAVA
  System.out.println(s.toLowerCase());//hello java
  System.out.println(s.charAt(3));//l
  System.out.println(s.equals(ss));//false
  System.out.println(s.equalsIgnoreCase(ss));//true
  System.out.println(ss.compareTo(s));
  System.out.println(ss.compareToIgnoreCase(s));//0

  System.out.println(s.contains("java"));//true
  System.out.println(s.indexOf("h"));//0
  System.out.println(s.endsWith("v"));//false
  System.out.println(s.startsWith("h"));//true
  System.out.println(ss.trim());//Hello Java
  System.out.println(s.replace("h", "z"));//zello java

  int N = 123;
  System.out.println(String.valueOf(N));//123
  System.out.println(Integer.toString(N));//123
}
}
