package task.marsRover.states;
import task.marsRover.Rover;
public class West implements Rover_state{
    private Rover rover;
    public West(Rover rover){
        this.rover = rover;
    }
    @Override
    public void MoveForward(){
        rover.DecrementX();
    }
    @Override
    public void MoveBackward(){
        rover.IncrementX();
    }
    @Override
    public void TurnRight(){
        rover.ChangeState(rover.GetNorthObject());
    }
    @Override
    public void TurnLeft(){
        rover.ChangeState(rover.GetSouthObject());
    }
}
