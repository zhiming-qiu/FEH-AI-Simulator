import org.junit.Test;
import src.Interactions;

public class TestInteractions {
  @Test
  public void testInteractions() {
    Class c = Interactions.class;
    assert c.getMethods().length == 0;
  }
}