public class CustomerManager {
    private BaseLogger logger;

    public CustomerManager(BaseLogger logger) { //Actually there is no Base
        // Logger here there is a DatabaseLogger the Base Logger only keeps its reference.
        this.logger = logger;
    }

    public void add() {
        System.out.println("customer added: ");
        this.logger.log("Log message: ");

        //ForExample
        //Making new means I am connected to this class.
        //bunun yerine Base Logger field yaratmak attribute

//        DatabaseLogger logger = new DatabaseLogger();
//        logger.log("Log message: ");
    }
}
