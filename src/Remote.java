public class Remote {
     
    
    Kitchen command;
 
    
    public void setCommand(Kitchen command) {
        this.command = command;
    }
 
    public void buttonPressed() {
        command.execute();
    }
}