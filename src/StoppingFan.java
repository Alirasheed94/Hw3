public class StoppingFan implements Kitchen {
 
    Fan fan;
 
    public StoppingFan(Fan fan) {
        super();
        this.fan = fan;
    }
 
    public void execute() {
        System.out.println("Stopping Kitchen Fan.");
        fan.stop();
    }
}