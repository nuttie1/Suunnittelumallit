package Assignments.Command;

public class DropCommand implements Command {
    private final Screen screen;

    public DropCommand(Screen screen) {
        this.screen = screen;
    }

    @Override
    public void execute() {
        screen.drop();
    }
}
