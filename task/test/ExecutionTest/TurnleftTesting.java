package task.test.ExecutionTest;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.verify;
import task.marsRover.execution.Turnleft;
import task.marsRover.Rover;
public class TurnleftTesting {

    @Mock Rover rover;
    private Turnleft turnleft;

    @Before public void initMocks() throws Exception {
      MockitoAnnotations.initMocks(this);
      turnleft = new Turnleft(rover);
    }
    @Test
    public void LeftMove() throws Exception {
        turnleft.Fire();
        verify(rover).turnLeft();
  }
}
  