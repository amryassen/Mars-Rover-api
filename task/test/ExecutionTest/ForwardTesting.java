package task.test.ExecutionTest;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.verify;
import task.marsRover.execution.Forward;
import task.marsRover.Rover;
public class ForwardTesting {

    @Mock Rover rover;
    private Forward forward;

    @Before public void initMocks() throws Exception {
      MockitoAnnotations.initMocks(this);
      forward = new Forward(rover);
    }
    @Test
    public void ForwardMove() throws Exception {
        forward.Fire();
        verify(rover).MoveForward();
  }
}
  