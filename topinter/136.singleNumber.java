/*
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4
*/

/*
note : 
一個數xor 0還會是那個數字本身
一個數字xor自己，會等於0
例如: 0 ^ 3 ^ 4 ^ 3 = 4
*/

class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i : nums) {
            result  = result ^ i;
        }
        return result;
    }
}

/*
note:
   利用hashmap做紀錄，將只有一個的返回
   map.containsKey(int) : 尋找 key 
   map.put(key, key's value) : 將key、value放入map
   map.keySet() : 沒有 Key 但是卻想要得到 Value ，這時可以考慮使用 HashMap 中的 keySet() 方法
   map.get(keys) : 取得 key 的 value
*/
class Solution {
    public int singleNumber(int[] nums) {
        Map <Integer, Integer> store = new HashMap();
        int result = 0;
        for(int iter : nums) {
            if(!store.containsKey(iter))
                store.put(iter,1);
            else
                store.put(iter, store.get(iter)+1);
        }
        for(Integer keys : store.keySet())
        {
            if(store.get(keys)<2)
                result = keys;
        }
        return result;
    }
}
