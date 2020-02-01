public class Final   
{
    public static void main(String[] args) 
    {
        Light kitchenLight = new Light();    
 
        Fan kitchenFan = new Fan();
 
 
        Remote remote = new Remote();   
 
        remote.setCommand(new TurnOnLight( kitchenLight ));
        remote.buttonPressed();
 
       
 
        remote.setCommand(new StartingFan( kitchenFan ));
        remote.buttonPressed();
 
        remote.setCommand(new StoppingFan( kitchenFan ));
        remote.buttonPressed();
 
        
    }
}