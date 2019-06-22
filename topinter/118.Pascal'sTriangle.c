/*
    1
   1 1
1[2,0] 2[2,1] 1
 1 3[3,1]  3 1

每一列起始跟結束必為 1 => arr[i][0] = arr[i][i]
中間的部分看視意圖的座標就可解題 arr[i][j] = arr[i-1][j-1] + arr[i-1][j] => arr[3][1] = arr[2][0] + arr[2][1]
*/
class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> arr(numRows); // Create a vector of vector with size
        for(int i=0; i<numRows; i++) {
            arr[i].resize(i+1); //declare  the i-th row to size of column
            arr[i][0]=arr[i][i]=1;
            for(int j=1; j<i ;j++) {
                arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
            }
        }
        return arr;
    }
};
