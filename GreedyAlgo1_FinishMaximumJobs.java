class Activity{
    int start;
    int end;
    public Activity(int start,int end){
        this.start=start;
        this.end=end;
    }
}
class CustomComparator implements Comparator<Activity>{

    public int compare(Activity a, Activity b)
    {
        return a.end-b.end;
    }
}

public class Solution {
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        int res = 1;
        ArrayList<Activity> activityList = new ArrayList<>();
        for(int i=0;i<B.size(); i++){
            activityList.add(new Activity(A.get(i), B.get(i)));
        }

        Collections.sort(activityList, new CustomComparator());

        int currentEnd = activityList.get(0).end;
        for(int i=1;i<activityList.size();i++){
            int currentStart=activityList.get(i).start;
            if(currentStart>=currentEnd){
                currentEnd = activityList.get(i).end;
                res++;
            }
        }
        return res;
    }

}
