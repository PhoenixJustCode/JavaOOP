package lab3.Problem5;

public class NewTime implements Comparable<NewTime> {
	private int hour;
	private int minute;
	private int second;

	public NewTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() { return hour; }
	public int getMinute() { return minute; }
	public int getSecond() { return second; }

	@Override
	public int compareTo(NewTime other) {
		if (this.hour != other.hour) return Integer.compare(this.hour, other.hour);
		if (this.minute != other.minute) return Integer.compare(this.minute, other.minute);
		return Integer.compare(this.second, other.second);
	}

	@Override
	public String toString() {
		return String.format("Time [%02d:%02d:%02d]", hour, minute, second);
	}
}
