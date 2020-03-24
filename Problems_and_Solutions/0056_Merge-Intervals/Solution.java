class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }

        List<int[]> lsResult = new ArrayList<int[]>();

        // Step 1: sorting
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));

        // Step 2: merging
        int[] preInterval = intervals[0];
        // lsResult.add(preInterval);
        int[] currInterval = null;
        for (int i = 0; i < intervals.length; i++) {
            currInterval = intervals[i];
            if (currInterval[0] <= preInterval[1]) {
                // merge interval
                preInterval[1] = Math.max(preInterval[1], currInterval[1]);
            } else {
                // add new interval and update previous interval
                lsResult.add(preInterval);
                preInterval = currInterval;
            }
        }
        lsResult.add(preInterval);

        return lsResult.toArray(new int[lsResult.size()][]);
    }
}
/*
 * force solution Time Complexity: O(n^2) traverse the input iterationally and
 * merge the interval when overlapping [L1, R1] [L2, R2] over lapping L1 <= L2
 * <= R1 or L2 <= L1 <= R2 new interval: [min(L1,L2) , max(R1,R2)] or add a new
 * interval when no overlapping
 * 
 * sort the interval by their first element [[1,3],[2,6],[8,10],[15,18]]
 * 
 * each iteration, take care only the current interval with previous interval we
 * already know L1 <= L2, then we only have to worry about L2 <= R1 not [L1, R1]
 * [L2, R2] merge the interval when L2 < R1
 * 
 * sort: O(nlogn) + merge: O(n) Time complexity: O(nlogn)
 * 
 */
