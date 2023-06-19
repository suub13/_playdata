package Time;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second =second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second =second;
    }

    public String toString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public Time nextSecond(){
        if (second == 59){
            second = 0;
            minute ++;
            if (minute == 60){
                minute = 0;
                hour ++;
                if(hour == 24){
                    hour = 0;
                }
            }
        } else {
            second ++;
        }
        return this;
    }

    public Time previousSecond(){
        if (second == 0){
            minute -= 1;
            second = 59;
            if (minute == -1){
                hour -= 1;
                minute = 59;
                if(hour == -1){
                    hour = 23;
                }
            }
        } else {
            second -= 1;
        }
        return this;
    }
}
