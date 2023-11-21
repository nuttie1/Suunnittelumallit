package Assignments.Adapter;

public class Main {
    public static void main(String[] args) {

        NewInterface normal = new NormalImplementation();
        normal.request();

        OldClass oldClass = new OldClass();
        NewInterface adapter = new Adapter(oldClass);

        adapter.request();
    }
}

