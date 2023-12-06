package Assignments.Adapter;

public class Adapter implements NewInterface {
    private OldClass oldClass;

    public Adapter(OldClass oldClass) {
        this.oldClass = oldClass;
    }

    public void request() {
        oldClass.oldRequest();
    }
}
