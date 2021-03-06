/*
Count the number of prime numbers less than a non-negative number, n.

Example:

Input: 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
*/

class Solution {
    public int countPrimes(int n) {
        int count = 0;
        boolean isPrime = false;
        for(int i=1; i<n; i++){
            if(i==2 || i==3)
                isPrime = true;
            for(int j=2; j*j<=i; j++)
            {
                if(i%j==0){
                    isPrime = false;
                    break;
                }
                   isPrime = true;
            }
            if(isPrime)
                 count++;               
        }
        return count;
    }
}
