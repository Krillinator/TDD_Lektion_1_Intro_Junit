import com.demo.lektion1.ScoreService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ScoreServiceTest {

    ScoreService scoreService; // Static == One Reference

    @BeforeEach
    void initialization() {
        scoreService = new ScoreService(0);
    }

    @Test
    @DisplayName(value = "Expect 0 + 2 to equal 2")
    void addToScoreExpect2() {
        scoreService.setScore(scoreService.getScore() + 2);

        assertEquals(2, scoreService.getScore());
    }

    @Test
    void addToScoreExpect4() {
        scoreService.setScore(scoreService.getScore() + 4);

        assertEquals(4, scoreService.getScore());
    }

}
