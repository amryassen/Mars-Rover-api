package task.marsRover;
import task.marsRover.execution.*;
public class API {
    CommandTranslation commandTranslation;
    public API(CommandTranslation commandTranslation){
        this.commandTranslation = commandTranslation;
    }

    public void CommandFire(String commands){
        for (char command : commands.toCharArray()) {
            if(commandTranslation.ValidCommands(command)){
                Execute exec = commandTranslation.TranslateCommand(command);
                exec.Fire();
            }
        }
    }
   
}
