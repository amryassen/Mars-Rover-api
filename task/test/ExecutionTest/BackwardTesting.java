package task.test.ExecutionTest;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.verify;
import task.marsRover.execution.Backward;
import task.marsRover.Rover;
public class BackwardTesting {

    @Mock Rover rover;
    private Backward backward;

    @Before public void initMocks() throws Exception {
      MockitoAnnotations.initMocks(this);
      backward = new Backward(rover);
    }
    @Test
    public void BackwardMove() throws Exception {
        backward.Fire();
        verify(rover).moveBackward();
  }
}
  