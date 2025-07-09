import java.util.Arrays;

public class TwoSum {
  public static void main(String[] args) {
    int[] nums={3,2,4};
    int target=6;
    int sum=0;
    Arrays.sort(nums);
        // two pointers
        int left =0,right=nums.length-1;
        while(left < right) {
             sum = nums[left] + nums[right];
            System.out.println(nums[left]);
            if(sum == target) {
               System.out.println(left+" "+right);
            } else if(sum < target) {
                left++;
            } else{
                right--;
            }
           
        }
        System.out.println(left+" "+right);
    }
}
