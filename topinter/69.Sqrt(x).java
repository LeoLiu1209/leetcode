/*
mplement int sqrt(int x).

Compute and return the square root of x, where x is guaranteed to be a non-negative integer.

Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.

Example 1:

Input: 4
Output: 2
Example 2:

Input: 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since 
             the decimal part is truncated, 2 is returned.
*/

/*
hint : better to use binary search to reduce the time complexity
*/
/*
class Solution {
    public int mySqrt(int x) {
        int result = 0;
        for(int i=1; i<=x; i++) {
            if(i*i == x)
                return i ;
            if(i*i > x) {
              result = i-1;
                break;
            }
        }
        return result;
    }
}
*/


class Solution {
    public int mySqrt(int x) {
        int low = 0;
        int high = x;
        while(low<=high){
          long mid = low + (high -low)/2; //avoid over flow
          if(mid*mid < x)
              low = (int)mid + 1;
          else if(mid*mid > x)
              high = (int)mid - 1;
         else
             return (int)mid;
        }
        return high;
    }
}


