public class Solution {
	// DO NOT MODIFY THE LIST
	public int repeatedNumber(final List<Integer> a) {
        int count1 =0, count2=0;
        int first = Integer.MIN_VALUE;
        int second = Integer.MAX_VALUE;
        int n = a.size();
        for(int i =0; i<a.size();i++){
            if(first == a.get(i)) count1++;
            else if(second == a.get(i)) count2++;
            else if(count1 == 0){
                count1++;
                first = a.get(i);
            }
            else if(count2 == 0){
                count2++;
                second = a.get(i);
            }
            else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int i=0;i<a.size();i++){
            if(first==a.get(i)) count1++;
            else if(second == a.get(i)) count2++;
        }

        if(count1> n/3) return first;
        else if(count2 > n/3) return second;
        return -1;
	}
}

