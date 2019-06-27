/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
Note:

All given inputs are in lowercase letters a-z.

hint : 垂直法
[l]eets
[l]eetcode
[l]eet
[l]eeds
       exception case : arr.length ==0 return ""
                        arr.length ==1 return arr[0]
       大迴圈走訪第一個字串
       小迴圈從第二、三....字串的第一個字原開始比較
       若不相同 則返回strs[0].substring(0,i)
       //需額外注意判斷 長度不同的狀況下 匯indexoutofbound if(i == strs[j].length())
         
*/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        for(int i=0; i<strs[0].length(); i++) {
            for(int j=1; j<strs.length; j++) {
                if(i == strs[j].length() || strs[0].charAt(i) !=  strs[j].charAt(i))//需多判斷字串不同長度的狀況
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }
}
