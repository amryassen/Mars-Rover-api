package task.marsRover.execution;

import task.marsRover.Rover;

public class Backward implements Execute{
    private Rover rover;
    public Backward(Rover rover){
        this.rover = rover;
    }
    @Override
    public void Fire(){
        rover.MoveBackward();
    }
}
