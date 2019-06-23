package algo.jsample;

import java.util.Arrays;

public class ActivitySelection {

	public int maxActivitiesPossible(Activity[] activities) {

		Arrays.sort(activities);

		int activityCount = 0;
		long nextStartTime = 0;
		for (int i = 0; i < activities.length; i++) {
			if (activities[i].getStartTime() >= nextStartTime) {
				activityCount++;
				nextStartTime = activities[i].getFinishTime();
			}
		}
		return activityCount;
	}
}
