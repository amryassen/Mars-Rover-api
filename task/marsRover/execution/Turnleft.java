package task.marsRover.execution;

import task.marsRover.Rover;
public class Turnleft implements Execute{
    private Rover rover;
    public Turnleft(Rover rover){
        this.rover = rover;
    }
    @Override
    public void Fire(){
        rover.turnLeft();
    }
}
