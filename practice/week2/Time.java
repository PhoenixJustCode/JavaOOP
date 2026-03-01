package week2;



public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int h, int m, int s) {
        setTime(h, m, s);
    }

    public void setTime(int hour, int m, int s) {
        if (this.hour < 0 || this.hour > 23 || m < 0 || m > 59 || s < 0 || s > 59) {
            System.out.println("Invalid time");
        }
        this.hour = hour;
        this.minute = m;
        this.second = s;
    }

    public String toUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStandard() {
        String period = (hour < 12) ? "AM" : "PM";
        int h = hour % 12;
        if (h == 0) h = 12;
        return String.format("%d:%02d:%02d %s", h, minute, second, period);
    }

    public void add(Time t) {
        int totalSeconds = this.second + t.second;
        int totalMinutes = this.minute + t.minute + totalSeconds / 60;
        int totalHours = this.hour + t.hour + totalMinutes / 60;

        this.second = totalSeconds % 60;
        this.minute = totalMinutes % 60;
        this.hour = totalHours % 24;
    }

    public static void main(String[] args) {
        Time t = new Time(23, 5, 6);
        System.out.println(t.toUniversal()); 
        System.out.println(t.toStandard());

        Time t2 = new Time(4, 24, 33);
        t.add(t2);
        System.out.println(t.toUniversal()); 
    }
}
