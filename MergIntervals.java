/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> result = new ArrayList<Interval>();
        int i=0;
        for(i=0;i<intervals.size();i++) {
            if(newInterval.end<intervals.get(i).start) {break;}
            else if (!(newInterval.start>intervals.get(i).end)){
                newInterval.start = Math.min(intervals.get(i).start, newInterval.start);
                newInterval.end = Math.max(intervals.get(i).end, newInterval.end);
            }
            else result.add(intervals.get(i));
        }
        result.add(newInterval);

        for(int j=i;j<intervals.size();j++) result.add(intervals.get(j));
        return result;
    }
}
