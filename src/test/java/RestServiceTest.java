import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class RestServiceTest {
    @Test
    public void shouldCalculateForRegistredAndOverLimit() {
        RestService servise = new RestService();
        long expected = 9;
        int actual = servise.calculate(100_000, 13_000);
        Assertions.assertEquals(expected, actual);

    }
}

