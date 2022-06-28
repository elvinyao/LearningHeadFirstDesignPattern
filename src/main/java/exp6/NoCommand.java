package exp6;

public class NoCommand implements Command {
    public void execute() {
        System.out.println("No Command");
    }

    @Override
    public void undo() {
        System.out.println("No Command Undo");
    }
}
