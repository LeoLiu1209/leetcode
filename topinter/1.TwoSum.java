/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/

/*
思路:
  先利用target把差值求出來，再來去檢查有沒有在map裡，
  if !containsKey 把 iter的值跟index丟進去map，方便下次查找
  if containsKey 把值的index取出來，在記錄這次的index值即可
  
map's method:
  map.containsKey()
  map.put(key, value)
  map.get(key)
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        int[] arr = new int[2];
        for(int i=0; i<nums.length; i++){
            int tmp = target -nums[i];
            if(!map.containsKey(tmp)){
                map.put(nums[i], i);
            }else{
                arr[0]=map.get(tmp);
                arr[1]=i;
            }
        }
        return arr;
    }
}
