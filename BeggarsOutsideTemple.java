// There are N (N > 0) beggars sitting in a row outside a temple. Each beggar initially has an empty pot. When the devotees come to the temple, they donate some amount of coins to these beggars. Each devotee gives a fixed amount of coin(according to his faith and ability) to some K beggars sitting next to each other.

// Given the amount donated by each devotee to the beggars ranging from i to j index, where 1 <= i <= j <= N, find out the final amount of money in each beggar's pot at the end of the day, provided they don't fill their pots by any other means.

public class Solution {
    public ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i=0;i<A;i++)
            res.add(0);
            
        for(int i = 0 ; i<B.size(); i++)
        {
            int rangeL = B.get(i).get(0) - 1;
            int rangeR = B.get(i).get(1) - 1;
            int amt = B.get(i).get(2);
            
            res.set(rangeL,res.get(rangeL)+amt);
            if(rangeR+1<A)
                res.set(rangeR+1, res.get(rangeR+1)-amt);
        }
        for(int i=1;i<A;i++)
            res.set(i, res.get(i-1)+res.get(i));
        return res;
    }
}
