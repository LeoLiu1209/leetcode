/*
Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Note:

Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.

hint : 
   1.先用 hashmap走訪並把數字和次數做紀錄
   2.走訪第二個arr 並觀看 map是否有有存在這個數字 && 他出現的次數是否超過0次 map.containsKey(j) && map.get(j) > 0
     如果有的話，調整其次數並加到 list
*/
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap();
        ArrayList<Integer> list = new ArrayList();
        for(int i : nums1) {
            if(!map.containsKey(i)) {
                map.put(i,1);
            }
            else {
                map.put(i, map.get(i)+1);
            }
        }
        for(int j : nums2) {
            if(map.containsKey(j) && map.get(j) > 0) {
                map.put(j, map.get(j)-1);
                list.add(j);
            }
        }
        int [] result = new int [list.size()];
        for(int i=0; i<list.size(); i++)
            result[i] = list.get(i);
        return result;
    }
}
//sort first 
/*
    1.先做sort
    2.若兩個arr相同，則記錄下來
    3.
    nums1 : [1,1,2,6]
    nums2 : [1,1,6]
    假設跑到 nus1[2] 跟 nums2[2]，為了要繼續比下去，因此要將nums1 idx+1
    才能繼續比下去
    4.注意終止條件
*/
/*
   learning: Convert ArrayList to Int [] array using .toArray():
    list.stream().mapToInt(Integer::valueOf).toArray();
*/
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
         ArrayList<Integer> list = new ArrayList();
        int nums1Size = nums1.length;
        int nums2Size = nums2.length;
        int i=0, j=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i < nums1Size && j < nums2Size ){
            if(nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;
                j++;
            }
            else if (nums1[i] < nums2[j])
                i++;
            else
                j++;
        }
        int listSize = list.size();
        int [] result = new int[listSize];
        for(int iter = 0; iter < listSize; iter++){
            result[iter] = list.get(iter);
        }
        //return list.stream().mapToInt(Integer:valueOf).toArray();
        return result;
    }
}
