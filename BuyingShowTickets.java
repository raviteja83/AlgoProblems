public class Solution {
    static long waitingTime(int[] N, int p) {
        int timeToBuy = 0;
        int n = N.length;

        for (int i = 0; i < p; i++) {
			if (N[i] < N[p])
			 timeToBuy += N[i];
			else
			 timeToBuy += N[p];
        }
        timeToBuy += N[p];

        for (int i = p + 1; i < n; i++) {
			if (N[i] < N[p])
			 timeToBuy += N[i];
			else
			 timeToBuy += N[p] - 1;
		}
		
		return timeToBuy;
    }
}
