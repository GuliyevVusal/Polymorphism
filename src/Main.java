public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();

    }
}
// 2.
// forExample
//        int[] numbers = new int[]{1,2,3,4,"BaseLogger"};
// We manage the system from one place, we can go tomorrow
// and create a new class and add it to BaseLogger.
// plug and play
//        BaseLogger[] baseLoggers =
//                new BaseLogger[]{new FileLogger(), new DatabaseLogger(), new EmailLogger()};
//        for (BaseLogger logger : baseLoggers) {
//            logger.log("Log message");
//        }


//        1.
//        EmailLogger emailLogger = new EmailLogger();
//        emailLogger.log("Email logged.");
