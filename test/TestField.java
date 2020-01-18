import org.junit.Test;
import src.Field;

public class TestField {
  @Test
  public void testField() {
    Class c = Field.class;
    assert c.getMethods().length == 0;
  }
}