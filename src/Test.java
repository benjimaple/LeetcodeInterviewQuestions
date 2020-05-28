import java.util.HashMap;
import java.util.Iterator;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0 ; i < nums.length; i ++) {
            int current_pos = nums[i];
            for (int j = i+1 ; j < nums.length; j ++){
                if(current_pos == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public void rotate(int[] nums, int k) {
        int len = nums.length;
        for (int i = 0; i < k; i++) {
            int last = nums[len - 1];
            for (int j = 1; j < len; j++) {
                nums[len - j] = nums[len - (j + 1)];
            }
            nums[0] = last;
        }
    }
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hash_table = new HashMap<>();

        for (int i : nums) {
            hash_table.put(i, hash_table.getOrDefault(i, 0) + 1);
        }

        Iterator it = hash_table.entrySet().iterator();
        while (it.hasNext()) {
            HashMap.Entry pair = (HashMap.Entry)it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
        }

        for (int i : nums) {
            if (hash_table.get(i) == 1) {
                return i;
            }
        }
        return 0;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 2,2, 3, 3};
        s.singleNumber(nums);
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }

    }
}