public class ValidPalindrome {
  public static void main(String[] args) {
    
    int x=121;
    int num=x;
    int reversedNumber=0;
        while(num>0){
            int i=num%10;
            reversedNumber=reversedNumber*10+i;
            num=num/10;
        }
        if(x==reversedNumber){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }


  }
}
