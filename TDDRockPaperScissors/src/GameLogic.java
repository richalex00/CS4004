
public class GameLogic {

public String run(int computerPlayerJerry, int computerPlayerTom) {
		
		String result = "Invalid";
		if (computerPlayerJerry < 4 && computerPlayerJerry >= 1) {
			if (computerPlayerJerry == computerPlayerTom) {
				result = "Its a Tie";
			}
		}
		return result;
	}
}