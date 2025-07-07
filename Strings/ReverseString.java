public class ReverseString {
  public static void main(String[] args) {
    String s="HelloWorld";
    String reveString="";

    for(int i=0;i<s.length();i++){
      reveString=s.charAt(i)+reveString;
    }
    System.out.println("Reversed String: "+reveString);
     reveString=reveString.toUpperCase();
     s=s.toUpperCase();
    if(reveString.equals(s)){
      System.out.println("String is Palindrome");
    }else{
      System.out.println("Not a Palindrome");
    }
  }
}
