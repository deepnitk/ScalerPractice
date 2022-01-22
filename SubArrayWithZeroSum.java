public class Solution {
    public int solve(ArrayList<Integer> A) {

        Set<Integer> hs = new HashSet<Integer>();

        int sum = 0;

        for (int i = 0; i < A.size(); i++)
        {
          sum += A.get(i);

          if (A.get(i) == 0
            || sum == 0
            || hs.contains(sum))
            return 1;
          hs.add(sum);
        }
        return 0;
        }
}
