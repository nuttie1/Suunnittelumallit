package Assignments.Decorator;

public class RealData implements Data {
    private final String data;

    public RealData(String data) {
        this.data = data;
    }

    @Override
    public String getData() {
        return this.data;
    }
}
