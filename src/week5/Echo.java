package week5;

public class Echo implements Command {
    private String  message;

    public Echo(String message) {
        this.message = message;
    }

    @Override
    public void execute() {
        System.out.println(message);
    }
}
