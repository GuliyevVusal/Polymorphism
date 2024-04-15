public class CustomerManager {
    private BaseLogger logger;

    public CustomerManager(BaseLogger logger) { 
        this.logger = logger;
    }

    public void add() {
        System.out.println("customer added: ");
        this.logger.log("Log message: ");

//        DatabaseLogger logger = new DatabaseLogger();
//        logger.log("Log message: ");
    }
}
