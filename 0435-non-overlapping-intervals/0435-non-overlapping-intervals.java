class Solution {
    class interval{
        int start;
        int end;
        interval(int start, int end){
            this.start=start;
            this.end=end;
        }
    }
    public int eraseOverlapIntervals(int[][] intervals) {
        int n=intervals.length;
        interval[] intrvl=new interval[n];
        for(int i=0;i<n;i++){
            intrvl[i]=new interval(intervals[i][0], intervals[i][1]);
        }
        Arrays.sort(intrvl, (a,b)->a.end-b.end);
        
        //since intrvl is sorted, 1st index will alwasy get chosen
        int count=1;
        int endtime=intrvl[0].end;
        for(int i=0;i<n;i++){
            if(intrvl[i].start>=endtime){
                count++;
                endtime=intrvl[i].end;
            }
        }
        return n-count;
    }
}