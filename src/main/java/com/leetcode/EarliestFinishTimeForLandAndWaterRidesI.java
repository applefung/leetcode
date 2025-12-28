package com.leetcode;

public class EarliestFinishTimeForLandAndWaterRidesI {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration,
            int[] waterStartTime, int[] waterDuration) {
        int minFinish = Integer.MAX_VALUE;

        // Try all combinations of land and water rides
        for (int i = 0; i < landStartTime.length; i++) {
            for (int j = 0; j < waterStartTime.length; j++) {
                // Option 1: Land ride first, then water ride
                int landFinish = landStartTime[i] + landDuration[i];
                int waterStart = Math.max(landFinish, waterStartTime[j]);
                int finish1 = waterStart + waterDuration[j];

                // Option 2: Water ride first, then land ride
                int waterFinish = waterStartTime[j] + waterDuration[j];
                int landStart = Math.max(waterFinish, landStartTime[i]);
                int finish2 = landStart + landDuration[i];

                // Take the minimum of both options
                minFinish = Math.min(minFinish, Math.min(finish1, finish2));
            }
        }

        return minFinish;
    }
}
