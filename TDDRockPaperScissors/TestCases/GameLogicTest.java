import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameLogicTest {

	private GameLogic game;
	
	@BeforeEach
	void setUp() {
		game= new GameLogic();
	}
	
	
	@Test
	public void Tie() { // rock = 2 
		int computerPlayerTom = 2;
		int computerPlayerJerry = 2;
		
		String result  = game.run(computerPlayerTom, computerPlayerJerry);
		assertEquals("Its a Tie", result);
		
	}

}
