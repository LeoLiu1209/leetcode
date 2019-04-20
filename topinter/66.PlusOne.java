/*
Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:

Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Example 2:

Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
*/

/*
此題如果按照第一用數值得解法，一但數字太大就沒辦法解!!
        //long sum = 0;
        // int expr = digits.length;
        // for(int i=0; i<digits.length; i++) {
        //     sum = sum + (long)(digits[i] * Math.pow(10,expr-i-1));
        // }
        // sum +=1;
        // if(sum >= Math.pow(10, expr))
        //     expr++;
        // System.out.print(sum);
        // int i=0;
        // int[] arr = new int[expr];
        // while(expr>0) {
        //     arr[i]=(int)(sum/(long)(Math.pow(10, expr-1)));
        //     sum = sum % (long)(Math.pow(10, expr-1));
        //     expr--;
        //     i++;
        // }
       // return arr;
note :
int[] arr = new int[10]; 
在上面的宣告中，會為arr配置10個整數的陣列元素，索引為0到9，初始值預設為0
[0,0,0,0,0,0,0,0,0,0]
*/
class Solution {
    public int[] plusOne(int[] digits) {
       
        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i]<9) {
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] newArr = new int[n+1];
        newArr[0]=1;
        return newArr;
    }
}
