There is a shop whose assistant told you that there are A puzzles in the shop and you want to buy B of them. They might differ in difficulty and size. The first jigsaw puzzle consists of A1 pieces, the second one consists of A2 pieces and so on.
You decided that the difference between the numbers of pieces in bought puzzles must be as small as possible. Let x be the number of pieces in the largest puzzle that the you buy and y be the number of pieces in the smallest such puzzle. You want to choose such B puzzles that x-y is as minimum as possible. Find the least possible value of x-y.
public class Solution {
    public int solve(ArrayList<Integer> a, int n) {
        int m = a.size();
        //m = 6
        //input  a = 10 12 10 7 5 22 n=4
        Collections.sort(a);
        //a after sort 5 7 10 10 12 22
        int leastValue = a.get(n-1) - a.get(0);
        for(int i=1; i<=m-n;++i) {
            if(a.get(i+n-1)-a.get(i) < leastValue) {
                leastValue = a.get(i+n-1)-a.get(i);
            }
        }
        return leastValue;
    }
}
