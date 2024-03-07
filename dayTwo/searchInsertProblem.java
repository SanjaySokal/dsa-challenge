package dayTwo;

public class searchInsertProblem {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = { 1, 3, 5, 6 };
        int target = 7;
        System.out.println(solution.searchInsert(nums, target));
    }
}

class Solution {
    public int searchInsert(int[] nums, int target) {
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return i;
            } else if (nums[i] < target && nums[i + 1] >= target) {
                return (i + 1);
            }
        }
        return 0;
    }
}
