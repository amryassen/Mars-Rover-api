package task.test.StatesTest;

import task.marsRover.Rover;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.verify;

import task.marsRover.states.South;

public class SouthTest {

    @Mock Rover rover;
    private South south;

    @Before public void initMocks() throws Exception {
        MockitoAnnotations.initMocks(this);
        south = new South(rover);
    }

    @Test
    public void ForwardMove() throws Exception {
        south.MoveForward();
        verify(rover).DecrementY();
        
        
    }

    @Test
    public void BackwardMove() throws Exception {
        south.MoveBackward();
        verify(rover).incrementY();
    }

    @Test
    public void TurnRightMove() throws Exception {
        south.TurnRight();
        verify(rover).ChangeState(rover.GetWestObject());
    }

    @Test
    public void TurnLeftMove() throws Exception {
        south.TurnLeft();
        verify(rover).ChangeState(rover.GetEastObject());
    }

}
