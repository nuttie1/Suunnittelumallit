package Assignments.Observer;

public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock("12:00");
        DigitalClock digitalClock = new DigitalClock(clock);

        clock.setTime("13:00");
    }
}
