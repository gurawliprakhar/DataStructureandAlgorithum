package Array;

public class ShradhaDidiSheet {
    //https://leetcode.com/problems/contains-duplicate/description/
    static boolean containsDuplcaite(int nums[]){
       for(int i=0; i<nums.length; i++){
           for(int j=i+1; j< nums.length; j++){
               if(nums[i] == nums[j]){
                   return true;
               }
           }
       }
       return false;
    }
    //https://leetcode.com/problems/search-in-rotated-sorted-array/description/
   //Let's walk through the code numerically using the provided test case `{4,5,6,7,0,1,2}` and the target `0`.
    //
    //1. **Finding the Minimum Element Index (`minSearch` function)**:
    //   - The function `minSearch` will be called to find the index of the smallest element in the array.
    //   - Initially, `left = 0` and `right = 6`.
    //   - The first iteration:
    //     - Calculate `mid = (0 + 6) / 2 = 3`.
    //     - Compare `nums[3] = 7` with its adjacent elements.
    //     - Since `nums[3] > nums[6]`, update `left = mid + 1 = 4`.
    //   - Second iteration:
    //     - Calculate `mid = (4 + 6) / 2 = 5`.
    //     - Compare `nums[5] = 1` with its adjacent elements.
    //     - Since `nums[5] < nums[6]`, update `right = mid - 1 = 4`.
    //   - Now, `left = right = 4`. The loop ends.
    //   - The smallest element is at index `4`, which is `0`.
    //
    //2. **Searching for the Target (`search` function)**:
    //   - We now know that the smallest element is at index `4`.
    //   - The target is `0`.
    //   - Since `nums[4] <= target (0) <= nums[6]`, we'll search in the range `[4, 6]`.
    //   - We call the overloaded `search` function with the parameters `(nums, 4, 6, 0)`.
    //
    //3. **Binary Search in the Given Range**:
    //   - In the `search` function, `left = 4`, `right = 6`.
    //   - The first iteration:
    //     - Calculate `mid = (4 + 6) / 2 = 5`.
    //     - `nums[5] = 1` which is not equal to the target `0`.
    //     - Since `nums[5] < 0`, we update `left = mid + 1 = 6`.
    //   - Second iteration:
    //     - `left` becomes greater than `right`, so the loop ends.
    //   - The target is not found within the range `[4, 6]`.
    //
    //4. **Final Output**:
    //   - The function returns `-1` since the target `0` is not found in the array.
    //
    //Therefore, the output of the program for the given test case `{4,5,6,7,0,1,2}` and target `0` would be `-1`, indicating that the target is not present in the array.
    static int search(int nums[], int target){
       // min will have index of minimum element of nums
        int min = minSearch(nums);
        //find in sorted left
        if(nums[min] <= target && target <= nums[nums.length-1]){
            return search(nums,min,nums.length-1,target);
        }else{
            return search(nums,0,min,target);
        }
    }
    //binary search to find target in left to right boundary
    static int search(int nums[], int left, int right,int target){
        int l = left;
        int r = right;
        while(l <= r){
            int mid = l+(r-l)/2;
            if(nums[mid] == target){
                return mid;
            } else if (nums[mid] > target) {
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return -1;
    }
    //smallest element index
    static int minSearch(int nums[]){
        int left = 0;
        int right = nums.length-1;

        while(left < right){
            int mid = left +(right-left)/2;
            if(mid > 0 && nums[mid-1] > nums[mid]){
                return mid;
            } else if (nums[left] <= nums[mid] && nums[mid]>nums[right]) {
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
      int nums[] = {4,5,6,7,0,1,2};
      int target = 0;
      System.out.println(search(nums,target));
    }
}
