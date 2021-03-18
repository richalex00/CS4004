import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameLogicTest {

    private GameLogic game;

    @BeforeEach
    void setUp() {
        game = new GameLogic();
    }

    //scissors(1), rock(2), paper(3)
    @Test
    public void Tie() {
        int computerPlayerTom = 2;
        int computerPlayerJerry = 2;

        String result = game.run(computerPlayerTom, computerPlayerJerry);
        assertEquals("Its a Tie", result);

    }
    @Test
    public void ScissorsVsRock() {
        int computerPlayerJerry = 1;
        int computerPlayerTom = 2;

        String result = game.run(computerPlayerJerry, computerPlayerTom );
        assertEquals("Tom picked Rock and Jerry picked scissors: Tom Wins!!!", result);

    }
    @Test
    public void ScissorsVsPaper() {
        int computerPlayerJerry = 1;
        int computerPlayerTom = 3;

        String result = game.run(computerPlayerJerry, computerPlayerTom );
        assertEquals("Tom picked paper and Jerry picked scissors: Jerry Wins!!!", result);
    }
    @Test
    public void RockVsScissors() {
        int computerPlayerJerry = 2;
        int computerPlayerTom = 1;

        String result = game.run(computerPlayerJerry, computerPlayerTom );
        assertEquals("Tom picked Scissors and Jerry picked Rock: Jerry Wins!!!", result);

    }
    @Test
    public void RockVsPaper() {
        int computerPlayerJerry = 2;
        int computerPlayerTom = 3;

        String result = game.run(computerPlayerJerry, computerPlayerTom );
        assertEquals("Tom picked paper and Jerry picked rock: Tom Wins!!!", result);

    }

    @Test
    public void PaperVsScissors() {
        int computerPlayerJerry = 3;
        int computerPlayerTom = 1;

        String result = game.run(computerPlayerJerry, computerPlayerTom );
        assertEquals("Tom picked scissors and Jerry picked paper: Tom Wins!!!", result);

    }
    @Test
    public void PaperVsRock() {
        int computerPlayerJerry = 3;
        int computerPlayerTom = 2;

        String result = game.run(computerPlayerJerry, computerPlayerTom );
        assertEquals("Tom picked Rock and Jerry picked Paper: Jerry Wins!!!", result);

    }
}

