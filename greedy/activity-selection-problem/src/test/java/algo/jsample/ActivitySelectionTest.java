package algo.jsample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ActivitySelectionTest {

	private ActivitySelection activitySelection = new ActivitySelection();

	@Test
	public void searchTest1() {
		Activity activity1 = new Activity(10, 20);
		Activity activity2 = new Activity(12, 25);
		Activity activity3 = new Activity(20, 30);

		Activity[] activities = new Activity[] { activity1, activity2, activity3 };

		Assertions.assertEquals(2, activitySelection.maxActivitiesPossible(activities));

	}

	@Test
	public void searchTest2() {
		Activity activity1 = new Activity(1, 2);
		Activity activity2 = new Activity(3, 4);
		Activity activity3 = new Activity(0, 6);
		Activity activity4 = new Activity(5, 7);
		Activity activity5 = new Activity(8, 9);
		Activity activity6 = new Activity(5, 9);

		Activity[] activities = new Activity[] { activity1, activity2, activity3, activity4, activity5, activity6 };

		Assertions.assertEquals(4, activitySelection.maxActivitiesPossible(activities));

	}
}