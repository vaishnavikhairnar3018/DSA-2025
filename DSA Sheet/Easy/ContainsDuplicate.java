//217. Contains Duplicate
import java.util.*;

public class ContainsDuplicate {
    public static boolean usingHashset(int[] nums) {

        //create a hashset to store integers
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])){
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(usingHashset(nums));
    }
}


