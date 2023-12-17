package Assignments.Command;

public class RaiseCommand implements Command {
    private final Screen screen;

    public RaiseCommand(Screen screen) {
        this.screen = screen;
    }


    @Override
    public void execute() {
        screen.raise();
    }
}
