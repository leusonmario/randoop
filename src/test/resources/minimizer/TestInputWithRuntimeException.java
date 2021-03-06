import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestInputWithRuntimeException {

  // Test case with runtime exception.
  @Test
  public void test1() throws Throwable {
    int i = 7;

    // Runtime exception thrown when i equals 7.
    if (i == 7) {
      throw new RuntimeException();
    }

    i += 1;

    // Assertion succeeds.
    org.junit.Assert.assertTrue(i == 8);
  }
}
