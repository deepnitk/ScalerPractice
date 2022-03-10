class Activity{
    int time;
    int profit;
    public Activity(int time, int profit){
        this.time = time;
        this.profit = profit;
    }
}

class TimeComparator implements Comparator<Activity>{
    public int compare(Activity a1, Activity a2){
        return a1.time - a2.time;
    }
}

public class Solution {
    public static int MOD = 1000000007;
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        long profit = 0;
        ArrayList<Activity> activityList = new ArrayList<>();
        for(int i=0;i<A.size();i++){
            activityList.add(new Activity(A.get(i), B.get(i)));
        }

        Collections.sort(activityList, new TimeComparator());
        int day = 0;
        for(int i=0;i<activityList.size();i++){
            if(day < activityList.get(i).time){
                minHeap.add(activityList.get(i).profit);
                day++;
            } else {
                if(minHeap.peek()< activityList.get(i).profit){
                    minHeap.poll();
                    minHeap.add(activityList.get(i).profit);
                }
            }
        }

        while(minHeap.size()>0){
            profit+=minHeap.poll();
            profit%=MOD;
        }
        return (int)profit;
    }
}
