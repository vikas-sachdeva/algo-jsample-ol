package algo.jsample;

public class Activity implements Comparable<Activity> {

	private long startTime;

	private long finishTime;

	public Activity(long startTime, long finishTime) {
		this.startTime = startTime;
		this.finishTime = finishTime;
	}

	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}

	public long getFinishTime() {
		return finishTime;
	}

	public void setFinishTime(long finishTime) {
		this.finishTime = finishTime;
	}

	@Override
	public int compareTo(Activity obj) {
		if (this.finishTime > obj.finishTime) {
			return 1;
		} else {
			return -1;
		}
	}
}
