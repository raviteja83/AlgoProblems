public class Solution {
    static int maxSumLCM(int n)
	{
        int max_sum = 0; 
        
		for (int i=1; i*i<=n; i++)
		{
			if (n%i == 0)
			{
				max_sum += i;
				if (n/i != i)
					max_sum += (n/i);
			}
		}
		
		return max_sum;
    }
    
    static long[] maxSubsetSum(int [] k) {
        int n = k.length;
        long[] ans = new long[n];

        for(int i= 0;i<n;i++) {
            ans[i] = maxSumLCM(k[i]);
        }
        return ans;
     }
}