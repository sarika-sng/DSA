import java.util.Arrays;

public class Anagrams {
  public static void main(String[] args) {
    String s1="Listeen";
    String s2="Silent";

    String str1=s1.toUpperCase();
    String str2=s2.toUpperCase();

    char[] arr1=str1.toCharArray();
    char[] arr2=str2.toCharArray();

    Arrays.sort(arr1);
    Arrays.sort(arr2);

    if(Arrays.equals(arr1, arr2)){
      System.out.println("Anagram");
    }else{
      System.out.println("Not Anagram");
    }
  }
}
