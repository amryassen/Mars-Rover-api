package task.marsRover.states;
import task.marsRover.Rover;

public class South implements Rover_state{
    private Rover rover;
    public South(Rover rover){
        this.rover = rover;
    }
    @Override
    public void MoveForward(){
        rover.DecrementY();
    }
    @Override
    public void MoveBackward(){
        rover.IncrementY();
    }
    @Override
    public void TurnRight(){
        rover.ChangeState(rover.GetWestObject());
    }
    @Override
    public void TurnLeft(){
        rover.ChangeState(rover.GetEastObject());
    }
}
