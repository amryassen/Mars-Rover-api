package task.test.StatesTest;

import task.marsRover.Rover;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.verify;

import task.marsRover.states.North;

public class NorthTest {

    @Mock Rover rover;
    private North north;

    @Before public void initMocks() throws Exception {
        MockitoAnnotations.initMocks(this);
        north = new North(rover);
    }

    @Test
    public void ForwardMove() throws Exception {
        north.MoveForward();
        verify(rover).incrementY();
        
    }

    @Test
    public void BackwardMove() throws Exception {
        north.MoveBackward();
        verify(rover).DecrementY();
    }

    @Test
    public void TurnRightMove() throws Exception {
        north.TurnRight();
        verify(rover).ChangeState(rover.GetEastObject());
    }

    @Test
    public void TurnLeftMove() throws Exception {
        north.TurnLeft();
        verify(rover).ChangeState(rover.GetWestObject());
    }

}
