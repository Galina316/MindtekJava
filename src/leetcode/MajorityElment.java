package leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElment {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> frequencyM = new HashMap<>();
        for (int num : nums) {
            frequencyM.put(num, frequencyM.getOrDefault(num, 0) + 1);
        }
        int majorityElement = 0;
        int maxFrequency = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyM.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                majorityElement = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }

        return majorityElement;
    }
    public static int majorityElement1(int[] nums) { /// faster way
        int candidate = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}
