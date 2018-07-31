public class Solution {
    static int minNumDays(int A, int K, int P) {
        if (K <= A) {
            return -1;
        }

        return P / (K-A) + 1;
    }
}