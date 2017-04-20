package week5;

public class Date implements Command {
    @Override
    public void execute() {
        System.out.println(System.currentTimeMillis());
    }
}
