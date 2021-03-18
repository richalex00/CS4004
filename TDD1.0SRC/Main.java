public class Main {
    public static void main(String[] args) {

        String result;
        GameLogic game = new GameLogic();
         //  Winner game1 = new Winner();

        System.out.printf("Rock Paper scissors game:\n");
        int computerPlayerTom = (int) (Math.random() * 3 + 1);
       int computerPlayJerry = (int) (Math.random() * 3 + 1);

        result = game.run(computerPlayJerry, computerPlayerTom); // runs game logic with the plays
       System.out.println(result);// prints result of game

    }
}
