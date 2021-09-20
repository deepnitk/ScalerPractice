Two players are playing a game. The rules are as follows:

Player 1 always moves first, and both players always play optimally.
Initially there are A piles, where each pile has B number of stones.
The players move in alternating turns. In each turn, a player can choose a pile of size x and reduce the number of stones to y, where 1 <= y < x, and x and y are coprime.
If the current player is unable to make a move, they lose the game.
Determine the winner.
  
public class Solution {
    public int solve(int A, int B) {
        if(B == 1 || A%2 ==0)
            return 2;
        return 1;
    }
}
