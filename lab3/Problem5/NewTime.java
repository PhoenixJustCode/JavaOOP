package Problem5;
import Problem1.Time;

@SuppressWarnings("unused")
public class NewTime implements Comparable<NewTime>{
	private int hour;
	private int minute;
	private int second;

	public int compareTo(NewTime t) {
		if (this.hour > t.hour) return 1;
		if (this.hour < t.hour) return -1;
		if (this.hour == t.hour) {
			if (this.minute < t.minute) return -1;   
			if (this.minute > t.minute) return 1;
			if (this.minute == t.minute) {
				if (this.second < t.second) return -1;   
				if (this.second > t.second) return 1;
			}
		}
		return 0;
	}
}
