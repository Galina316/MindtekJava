package collectionsforstreams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class setPractice {


        public boolean containsDuplicate(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            for (int num : nums) {
                if (set.contains(num)) {
                    return true;
                }
                set.add(num);
            }
            return false;
        }
    public boolean containsDuplicate1(int[] nums){
       Set<Integer> set = new HashSet<>();
        for(int el :nums) if(!set.add(el))return true;

        return false;
        }
    }




