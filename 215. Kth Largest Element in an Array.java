class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Arrays.sort(nums);
        // return nums[nums.length - k];
        return quickSort(nums,0,nums.length-1,k);
    }
    
    public int quickSort(int[] nums, int low, int high, int k) {
        if (low >= high) return nums[low];
        int point = partition(nums,low,high);
        if (nums.length - point == k) return nums[point];
        else if (nums.length - point > k) {
            return quickSort(nums, point + 1, high, k);
        } else {
            return quickSort(nums, low, point - 1, k);
        }
    }
    
    public int partition(int[] temp, int low, int high) {
        int cur = temp[low];
        while (low < high) {
            while (low < high && temp[high] >= cur) {
                high--;
            }
            temp[low] = temp[high];
            while (low < high && temp[low] <= cur) {
                low++;
            }
            temp[high] = temp[low];
        }
        temp[low] = cur;
        return low;
    }
}

// O(nlogn) use the idea of qucik sort, partition the array, divide and conquer;
