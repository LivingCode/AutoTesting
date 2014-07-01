import android.test.InstrumentationTestCase;

/**
 * Basic unit testing class
 * Created by Mark on 01/07/2014.
 */
public class FirstUnitTest extends InstrumentationTestCase {

    /**
     * Simple test that will fail
     * @throws Exception
     */
    public void testThatWeGetOne() throws Exception {
        final int expected = 1;
        final int whatWeGot = 5;
        assertEquals(expected, whatWeGot);
    }
}
