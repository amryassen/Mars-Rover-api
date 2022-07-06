package task.marsRover;
import java.util.HashMap;
import task.marsRover.execution.*;
public class CommandTranslation {
    private Execute forward;
    private Execute backward;
    private Execute turnleft;
    private Execute turnright;
    private Rover rover;
    private HashMap<Character,Execute>CommandsArray;
    public CommandTranslation(Rover rover){
        this.rover = rover;
        this.forward = new Forward(this.rover);
        this.backward = new Backward(this.rover);
        this.turnleft = new Turnleft(this.rover);
        this.turnright = new Turnright(this.rover);
        this.CommandsArray = new HashMap<>();
        this.CommandsArray.put('R', this.turnleft);
        this.CommandsArray.put('L', this.turnright);
        this.CommandsArray.put('F', this.forward);
        this.CommandsArray.put('B', this.backward);
    }

    public boolean ValidCommands(char command){
        return CommandsArray.containsKey(command);
    }

    public Execute TranslateCommand(char command){
        return CommandsArray.get(command);
    }
}
