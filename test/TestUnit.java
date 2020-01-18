import org.junit.Test;
import src.Unit;

public class TestUnit {
  @Test
  public void testUnit() {
    Class c = Unit.class;
    assert c.getMethods().length == 0;
  }
}