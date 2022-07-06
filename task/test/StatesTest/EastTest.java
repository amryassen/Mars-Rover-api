package task.test.StatesTest;

import task.marsRover.Rover;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.verify;
import task.marsRover.states.East;

public class EastTest {

    @Mock
    Rover rover;
    private East east;

    @Before
    public void initMocks() throws Exception {
        MockitoAnnotations.initMocks(this);
        east = new East(rover);
    }

    @Test
    public void ForwardMove() throws Exception {
        east.MoveForward();
        verify(rover).incrementX();
    }

    @Test
    public void BackwardMove() throws Exception {
        east.MoveBackward();
        verify(rover).DecrementX();
    }

    @Test
    public void TurnRightMove() throws Exception {
        east.TurnRight();
        verify(rover).ChangeState(rover.GetSouthObject());
    }

    @Test
    public void TurnLeftMove() throws Exception {
        east.TurnLeft();
        verify(rover).ChangeState(rover.GetNorthObject());
    }

}
