package task.marsRover.execution;

import task.marsRover.Rover;

public class Forward implements Execute{
    private Rover rover;
    public Forward(Rover rover){
        this.rover = rover;
    }
    @Override
    public void Fire(){
        rover.MoveForward();
    }
}
