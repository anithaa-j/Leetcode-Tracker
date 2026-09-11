// Last updated: 9/11/2026, 9:34:45 AM
1class Solution {
2    public int totalNumbers(int[] digits) {
3        int n = digits.length;
4        int count = 0;
5        boolean[] used = new boolean[1000];
6
7        for(int i =0;i<n;i++){
8            for(int j =0;j<n;j++){
9                for(int k =0;k<n;k++){
10                    if(i==j || j==k || i == k) continue;
11                    if( digits[i] == 0) continue;
12                    if(digits[k] % 2 !=0) continue;
13                    int number = digits[i] * 100
14                               + digits[j] * 10
15                               + digits[k];
16
17                    if (!used[number]) {
18                        used[number] = true;
19                        count++;
20                    }
21                }
22            }
23        }
24        return count;
25    }
26}