import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class TimeoutServiceTest {

    @Test
    @DisplayName(value = "Expect algorithm to take up to 1 seconds")
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    void shortAlgorithm() throws InterruptedException {
        Thread.sleep(900);
    }

    @Test
    @DisplayName(value = "Expect algorithm to take up to 2 seconds")
    @Timeout(value = 2000, unit = TimeUnit.MILLISECONDS)
    void longAlgorithm() throws InterruptedException {
        Thread.sleep(3000);
    }

}
