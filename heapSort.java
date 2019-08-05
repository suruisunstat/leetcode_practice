import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;



// heap sort
public class Solution {
    public void sort(int[] nums) {
        //int[] temp = new int[nums.length];
        for (int i = (nums.length - 1 - 1)/2; i>=0; i--) {
            adjustHeap(nums,i,nums.length);
        }

        for (int j = nums.length - 1; j >= 0; j--) {
            swap(nums,0,j);
            adjustHeap(nums,0,j);
        }
    }


    public void adjustHeap(int[] arr, int i, int length) {
        int temp = arr[i];
        for (int k = i * 2 + 1; k < length; k = 2 * k + 1) {
            if (k+1 < length && arr[k] < arr[k+1]) {
                k++;
            }

            if (arr[k] > temp) {
                arr[i] = arr[k];
                i = k;
            } else {
                break;
            }
        }

        arr[i] = temp;
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

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

