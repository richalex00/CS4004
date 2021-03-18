public class GameLogic {
    public String run(int computerPlayerJerry, int computerPlayerTom) {

        String result = "Invalid";

        if (computerPlayerJerry < 4 && computerPlayerJerry >= 1) {
            if (computerPlayerTom < 4 && computerPlayerTom >= 1) {

            if (computerPlayerJerry == computerPlayerTom) {

                result = "Its a Tie";

            } else if (computerPlayerJerry == 1) {

                if (computerPlayerTom == 2) {

                    result = "Tom picked Rock and Jerry picked scissors: Tom Wins!!!";

                }
                else {

                    result = "Tom picked paper and Jerry picked scissors: Jerry Wins!!!";
                }
            } else if (computerPlayerJerry == 2) {

                if (computerPlayerTom == 1) {

                    result = "Tom picked Scissors and Jerry picked Rock: Jerry Wins!!!";
                }
                else {

                    result = "Tom picked paper and Jerry picked rock: Tom Wins!!!";
                }
            } else {

                if (computerPlayerTom == 1) {
                    result = "Tom picked scissors and Jerry picked paper: Tom Wins!!!";
                }
                else {
                    result = "Tom picked Rock and Jerry picked Paper: Jerry Wins!!!";
                }
                return result;
            }

        }
        }
        return result;
    }
}
