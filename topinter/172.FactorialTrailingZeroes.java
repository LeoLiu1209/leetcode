/*
5! = 1*2*3*4*5
一開使初步的想法是找 5*2 有幾對，就有幾個0;
但用2來找相對來說太多了，因此換找5有幾個!!
以 20! 來說就是 5 10 15 20 這樣有尾數有0 就會有 n/5 = 4個!
但如果是 n/5 的話，25! 結果是6個5，原因是因為 25 = 5*5 有兩個5。
tl;dr
結論:
f(n) = n/5 + f(n/5)!;
*/
class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        while(n>0) {
            n=n/5;
            count += n;
        }
        return count;
    }
}
/*
recursive
class Solution {
    public int trailingZeroes(int n) {
        if(n<5)
            return 0;
        if(n<10)
            return 1;
        return (n/5+trailingZeroes(n/5));
    }
}
*/
