package task.marsRover.states;
import task.marsRover.Rover;

public class North implements Rover_state{
    private Rover rover;
    public North(Rover rover){
        this.rover = rover;
    }
    @Override
    public void MoveForward(){
        rover.IncrementY();
    }
    @Override
    public void MoveBackward(){
        rover.DecrementY();
    }
    @Override
    public void TurnRight(){
        rover.ChangeState(rover.GetEastObject());
    }
    @Override
    public void TurnLeft(){
        rover.ChangeState(rover.GetWestObject());
    }
}
