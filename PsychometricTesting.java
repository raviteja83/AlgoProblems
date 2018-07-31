public class Solution {
    static int[] jobOffers(int[] scores, int[] lowerLimits, int[] upperLimits) {
        int n = scores.length;
        int q = lowerLimits.length;
        int[] offers = new Int[q];

        for(int i=0; i <q; i++) {
          int a = lowerLimits[i];
          int b = upperLimits[i];
          int c_offers = 0;
          for(int j=0; j<n;j++) {
            if(scores[i] >= a && scores[i] <= b) {
                c_offers++;
            }
          }
          offers[i] = c_offers;
        }
        return offers;
    }
}