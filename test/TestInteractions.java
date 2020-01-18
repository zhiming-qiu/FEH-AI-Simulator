import static org.junit.Assert.assertTrue;

import org.junit.Test;
import src.Interactions;

public class TestInteractions {
  @Test
  public void testInteractions() {
    assertTrue(Interactions.dummy() == "dummy");
  }
}