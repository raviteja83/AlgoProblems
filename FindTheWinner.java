public class Solution {
    static String winner(int andrea[], int maria[], String s) {
        int diff = 0;
         for(int i =0; i < andrea.length; i++) {
             if(s =="Odd" && i%2 == 1) {
                diff += andrea[i] - maria[i];
             }
             if(s == "Even" && i%2 ==0) {
                 diff += andrea[i] - maria[i];
             }
        }
        return diff > 0 ? "Andrea": "Maria";
    }
}