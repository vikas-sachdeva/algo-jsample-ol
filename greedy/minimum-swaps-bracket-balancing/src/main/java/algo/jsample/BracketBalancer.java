package algo.jsample;

public class BracketBalancer {

	public long swapCount(String str) {
		long count = 0;
		long openingBracketCount = 0;
		long unmatchedBracketCount = 0;

		char[] chArray = str.toCharArray();
		for (int i = 0; i < chArray.length; i++) {

			if (chArray[i] == '[') {
				if (unmatchedBracketCount > 0) {
					count++;
				} else {
					openingBracketCount++;
				}
			} else {
				if (openingBracketCount == 0) {
					unmatchedBracketCount++;
				} else {
					openingBracketCount--;
				}
			}
		}
		return count;

	}
}
