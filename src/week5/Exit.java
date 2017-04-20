package week5;

public class Exit implements Command {
    @Override
    public void execute() {
        System.out.println("Goodbye!");
    }
}
