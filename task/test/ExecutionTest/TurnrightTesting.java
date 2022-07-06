package task.test.ExecutionTest;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.verify;
import task.marsRover.execution.Turnright;
import task.marsRover.Rover;
public class TurnrightTesting {

    @Mock Rover rover;
    private Turnright turnright;

    @Before public void initMocks() throws Exception {
      MockitoAnnotations.initMocks(this);
      turnright = new Turnright(rover);
    }

    @Test
    public void RightMove() throws Exception {
        turnright.Fire();
        verify(rover).turnRight();
  }
}
  