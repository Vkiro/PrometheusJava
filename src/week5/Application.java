package week5;

public class Application {
    public static void main(String[] args) {
        if (args != null) {
            if (args.length == 1) {
                if ("help".equals(args[0])) {
                    new Help().execute();
                } else if ("exit".equals(args[0])) {
                    new Exit().execute();
                } else {
                    System.out.println("Error");
                }
            } else if (args.length == 2) {
                if ("date".equals(args[0])) {
                    if ("now".equals(args[1])) {
                        new Date().execute();
                    } else {
                        System.out.println("Error");
                    }
                } else if ("echo".equals(args[0])) {
                    new Echo(args[1]).execute();
                } else {
                    System.out.println("Error");
                }
            } else {
                System.out.println("Error");
            }
        } else {
            System.out.println("Error");
        }
    }
}
