package task.marsRover.execution;

import task.marsRover.Rover;
public class Turnright implements Execute{
    private Rover rover;
    public Turnright(Rover rover){
        this.rover = rover;
    }
    @Override
    public void Fire(){
        rover.turnRight();
    }
}
