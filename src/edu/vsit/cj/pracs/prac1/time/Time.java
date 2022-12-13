package edu.vsit.cj.pracs.prac1.time;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return this.hour;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return this.minute;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return this.second;
    }
    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.setHour(hour);
        this.setMinute(minute);
        this.setSecond(second);
    }

    @Override
    public String toString() {
        return String.format(
                "%1$02d:%2$02d:%3$02d", // hh:mm:ss
                this.getHour(),
                this.getMinute(),
                this.getSecond()
        );
    }

    public Time nextSecond() {
        this.setSecond(this.getSecond() + 1);

        if(this.getSecond() == 60) {
            this.setMinute(this.getMinute() + 1);
            this.setSecond(00);

            if(this.getMinute() == 60) {
                this.setHour(this.getHour() + 1);
                this.setMinute(00);
            }

            if(this.getHour() == 24) {
                this.setHour(00);
            }
        }

        return this;
    }

    public Time previousSecond() {
        this.setSecond(this.getSecond() - 1);

        if(this.getSecond() == -1) {
            this.setMinute(this.getMinute() - 1);
            this.setSecond(59);

            if(this.getMinute() == -1) {
                this.setHour(this.getHour() - 1);
                this.setMinute(59);
            }

            if(this.getHour() == -1) {
                this.setHour(23);
            }
        }

        return this;
    }
}
