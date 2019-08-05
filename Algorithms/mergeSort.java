//import com.sun.source.tree.Tree;
//import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;



// merge sort
public class Solution {
    public void sort(int[] nums) {
        int[] temp = new int[nums.length];
        mergeSort(nums,0,nums.length-1,temp);
    }

    public void mergeSort(int[] nums, int left, int right, int[] temp) {
        if (left < right) {
            int mid = left + (right - left)/2;
            mergeSort(nums, left, mid,temp);
            mergeSort(nums,mid+1,right,temp);
            merge(nums,left,mid,right,temp);
        }
    }

    public void merge(int[] nums, int left, int mid, int right, int[] temp) {
        int i = left;
        int j = mid + 1;
        int t = 0;
        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[t++] = nums[i++];
            } else {
                temp[t++] = nums[j++];
            }

        }

        while(i <= mid) {
            temp[t++] = nums[i++];
        }

        while(j <= right) {
            temp[t++] = nums[j++];
        }
        t = 0;
        while (left <= right) {
            nums[left++] = temp[t++];
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

