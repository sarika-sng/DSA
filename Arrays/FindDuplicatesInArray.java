import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicatesInArray{

  public static void main(String[] args) {
    int[] arr={1,2,3,3,4,4,4,5,6};
    List<Integer> duplicate=new ArrayList<>();
    Set<Integer> distictSet=new HashSet<>();

    for(int i:arr){
      if(!distictSet.add(i)){
        duplicate.add(i);
      }
    }
    System.out.println("Distinct elements :"+distictSet);
    System.out.println("List of duplicate elements: "+duplicate);
  }
}