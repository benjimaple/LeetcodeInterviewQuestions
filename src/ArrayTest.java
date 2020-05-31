import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int current_pos = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (current_pos == nums[j]) {
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
            HashMap.Entry pair = (HashMap.Entry) it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
        }

        for (int i : nums) {
            if (hash_table.get(i) == 1) {
                return i;
            }
        }
        return 0;
    }

    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = 0; i < len; i++) {
            if (i == (len - 1) && digits[len - i - 1] == 9) {
                int[] newNumber = new int[len + 1];
                for (int j = 0; j < len + 1; j++) {
                    newNumber[j] = 0;
                }
                newNumber[0] = 1;
                digits = newNumber;
            } else {
                if (digits[len - i - 1] == 9) {
                    digits[len - i - 1] = 0;
                } else {
                    digits[len - i - 1] = digits[len - i - 1] + 1;
                    break;
                }

            }
        }
        return digits;
    }

    public void moveZeroes(int[] nums) {
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] == 0 && nums[i + 1] != 0) {
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                    nums[j + 1] = 0;
                }
            }
        }
    }

    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        }
        return res;
    }


    public void reserve(char[] s, int i){
        char temp = s[i];
        s[i] = s[s.length-1-i];
        s[s.length-1-i] = temp;
    }

    public void reverseString(char[] s) {
        for(int i =0 ; i< s.length/2; i++) {
            reserve(s, i);
        }
    }

    public boolean isValidSudoku(char[][] board) {
        int[] isValidList = {0, 0, 0};
        for (int i = 0; i < 9; i++) {

        }
        return false;
    }

    public boolean hasDuplicates(int[] nums) {
        Set<Integer> reduceDuplicates = new HashSet<Integer>();
        for (int num : nums) {
            reduceDuplicates.add(num);
        }
        return reduceDuplicates.size() != nums.length;
    }
}

public class ArrayTest {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 2, 3, 0, 5, 9, 4};
        System.out.println(s.hasDuplicates(nums));

        //        Solution s = new Solution();
//        s.moveZeroes(nums);
//        for (int value : nums) {
//            System.out.println(value);
//        }

    }
}