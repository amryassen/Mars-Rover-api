package task.marsRover.states;
import task.marsRover.Rover;
public class East implements Rover_state{
    private Rover rover;
    public East(Rover rover){
        this.rover = rover;
    }
    @Override
    public void MoveForward(){
        rover.IncrementX();
    }
    @Override
    public void MoveBackward(){
        rover.DecrementX();
    }
    @Override
    public void TurnRight(){
        rover.ChangeState(rover.GetSouthObject());
    }
    @Override
    public void TurnLeft(){
        rover.ChangeState(rover.GetNorthObject());
    }
}
