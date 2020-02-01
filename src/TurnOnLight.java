public class TurnOnLight implements Kitchen {
 
    Light light;
 
    public TurnOnLight(Light light) {
        super();
        this.light = light;
    }
 
    public void execute() {
        System.out.println("Turning on Kitchen light.");
        light.turnOn();
    }
}