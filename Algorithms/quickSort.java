// might cause stack overflow
// quick sort
public class Solution {
    public void sort(int[] nums) {
        //int[] temp = new int[nums.length];
        quickSort(nums,0,nums.length-1);
    }

    public void quickSort(int[] nums, int l, int r) {
        if (l < r) {
            int i = l, j = r, x = nums[l];
            while (i < j) {
                while (i < j && nums[j] >= x) {
                    j--;
                }
                if (i < j) nums[i++] = nums[j];
                while (i < j && nums[i] < x) {
                    i++;
                }
                if (i < j) nums[j--] = nums[i];
            }
            nums[i] = x;
            quickSort(nums, l,i-1);
            quickSort(nums,i,r);
        }
    }

    public static void main(String args[]) {
        Solution sol = new Solution();
        int[] arr = {9,8,7,6,5,4,3,2,1};
        sol.sort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //List<List<Integer>> res = sol.subsets(nums);
        //System.out.println(res);
    }


}
