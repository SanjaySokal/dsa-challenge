package TimeComplexity;

public class RemoveEle {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = { 3, 2, 2, 3 };
        int val = 3;
        System.out.println(solution.removeElement(arr, val));
    }
}

class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
