package task.marsRover;
import task.marsRover.states.*;


public class Rover {
    private Rover_state north;
    private Rover_state south;
    private Rover_state east;
    private Rover_state west;
    private position pos;
    private Rover_state state;
    public Rover(position pos , Rover_state state){
        this.north = new North(this);
        this.south = new South(this);
        this.east = new East(this);
        this.west = new West(this);
        this.pos = pos;
        this.state = state;
    }
    public position GetPosition(){
        return pos;
    }

    public void SetPosition(position pos){
        this.pos = pos;
    }

    public void ChangeState(Rover_state state){
        this.state = state;
    }

    public Rover_state GetState(){
        return state;
    }
    public void TurnRight(){
        state.TurnRight();
    }

    public void MoveBackward(){
        state.MoveBackward();
    }

    public void MoveForward(){
        state.MoveForward();
    }

    public void turnRight(){
        state.TurnRight();
    }

    public void turnLeft(){
        state.TurnLeft();
    }

    public Rover_state GetSouthObject(){
        return south;
    }

    public Rover_state GetNorthObject(){
        return north;
    }

    public Rover_state GetEastObject(){
        return east;
    }

    public Rover_state GetWestObject(){
        return west;
    }
    
    public void IncrementX(){
        pos.IncrementX();
    }

    public void DecrementX(){
      pos.DecrementX();
    }

    public void IncrementY(){
        pos.IncrementY();
    }

    public void DecrementY(){
        pos.DecrementY();
    }
    
    
}
