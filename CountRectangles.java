public class Solution {
    public int solve(int[] x, int[] y) {
        int res = 0;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < x.length; i++) {
            map.put(x[i] + "" + y[i], map.getOrDefault(x[i] + "" + y[i], 0) + 1);
        }
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < y.length; j++) {
                if (x[i] != x[j] && y[i] != y[j]) {
                    if (map.containsKey(x[i] + "" + y[j]) && map.get(x[i] + "" + y[j]) == 1 &&
                            map.containsKey(x[j] + "" + y[i]) && map.get(x[j] + "" + y[i]) == 1) {
                        res++;
                    }
                }
            }
        }
        return res / 2;
    }
}
