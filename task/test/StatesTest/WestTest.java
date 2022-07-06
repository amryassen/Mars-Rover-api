package task.test.StatesTest;

import task.marsRover.Rover;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.verify;
import task.marsRover.states.West;

public class WestTest {

    @Mock Rover rover;
    private West west;

    @Before public void initMocks() throws Exception {
        MockitoAnnotations.initMocks(this);
        west = new West(rover);
    }

    @Test
    public void ForwardMove() throws Exception {
        west.MoveForward();
        verify(rover).DecrementX();
        
    }

    @Test
    public void BackwardMove() throws Exception {
        west.MoveBackward();
        verify(rover).incrementX();
    }

    @Test
    public void TurnRightMove() throws Exception {
        west.TurnRight();
        verify(rover).ChangeState(rover.GetNorthObject());
    }

    @Test
    public void TurnLeftMove() throws Exception {
        west.TurnLeft();
        verify(rover).ChangeState(rover.GetSouthObject());
    }

}
