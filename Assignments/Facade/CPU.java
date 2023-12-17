package Assignments.Facade;

class CPU {
    void Freeze() {
        System.out.println("CPU Freeze");
    }

    void Jump(long position) {
        System.out.println("CPU Jump to position: " + position);
    }

    void Execute() {
        System.out.println("CPU Execute");
    }
}
