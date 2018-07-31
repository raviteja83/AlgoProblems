
public class Solution {
    static String getCirclesInfo(int x1, int y1, int x2, 
                      int y2, int r1, int r2)
    {
        int distSq = (x1 - x2) * (x1 - x2) +
                     (y1 - y2) * (y1 - y2);
        int radSumSq = (r1 + r2) * (r1 + r2);
        if(x1 == x2 && y1 == y2 && r1 != r2) {
            return "Concurrent";
        } else if (distSq == radSumSq) {
            return "Touching";
        } else if (distSq > radSumSq) {
            if(isInside(x1, y1, r1, x2, y2)) {
                return "Disjoint-Inside";
            } else {
                return "Disjoint-Outside";
            }
        } else {
            return "Intersecting";
        }
    }

    static boolean isInside(int circle_x, int circle_y, 
                                 int rad, int x, int y)
    {
        if ((x - circle_x) * (x - circle_x) +
            (y - circle_y) * (y - circle_y) <= rad * rad)s
            return true;
        else
            return false;
    }

    static int getIntFromString(String str) {
        return Integer.parseInt(str);
    }

    static String[] circles(String[] info) {
        int n =info.length;
        String[] ans = new String[n];
        for(int i =0; i<info.length; i++) {
            String str = info[i];
            String[] c = str.split("\\s");
            ans[i] = getCirclesInfo(
                getIntFromString(c[0]),
                getIntFromString(c[1]),
                getIntFromString(c[3]),
                getIntFromString(c[4]),
                getIntFromString(c[2]),
                getIntFromString(c[5])
            ); 
        }   
        return ans;
    } 
}