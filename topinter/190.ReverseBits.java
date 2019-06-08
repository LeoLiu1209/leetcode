/*
1. get last digit : int tmp = n & 1
2. right shift 1 bit : n<<1
3. left shift new num add last digit get from step one : result = result << 1 || tmp

example : 
intput : 011  => ans 110
1.get 1 
2.right shift 011 : 01
3.left shift 0 => 0 and add  1 => 1
sec time : 
1.get last digit 01 &1 => 1 
2.right shit 01 : 0
3:left shift 1 => 10 and add 1 => 11
third time :
1.get last digit 0 & 1 => 0
2.right shift 0 => 0;
3.left shift 11 => 110 and add 0 => 110
*/

public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
    int result = 0;
        for(int i=0; i<32; i++) {
             int tmp = n & 1 ;
             n = n >>1;
             result = result<<1 | tmp ; 
         }
    return result;    
    }
}

