public class StartingFan implements Kitchen {
 
    Fan fan;
 
    public StartingFan(Fan fan) {
        super();
        this.fan = fan;
    }
 
    public void execute() {
        System.out.println("starting Kitchen Fan.");
        fan.start();
    }
}