public class StringCompressions {
  public static void main(String[] args) {
    
    String s="aaabbbcccdddeeffffe";
    int count=1;
    StringBuilder sb=new StringBuilder();

    for(int i=0;i<s.length()-1;i++){

      if(s.charAt(i+1)==s.charAt(i)){
        count++;
      }else{
        sb.append(s.charAt(i));
        sb.append(count);
        count=1;
      }
    }
    System.out.println("Compressed String: "+sb);

  }
  
}
