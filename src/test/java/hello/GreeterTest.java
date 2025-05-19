package hello;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GreeterTest {

    @Test
    public void testSayHello() {
        Greeter greeter = new Greeter();
        String expected = "YES CD WORKS FINALLY!! OM NAMAH SHIVAYA, LETS FUCKING GOOO";
        assertEquals(expected, greeter.sayHello());
    }
}
