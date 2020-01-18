import static org.junit.Assert.assertTrue;

import org.junit.Test;
import src.Field;

public class TestField {
  @Test
  public void testField() {
    assertTrue(Field.dummy() == "dummy");
  }
}