public class DiceGame {
    private Die die1;
    private Die die2;
    public boolean play() {
        die1 = new Die();
        die2 = new Die();
        die1.roll();
        die2.roll();
        int total = die1.getFaceValue() + die2.getFaceValue();
        return total == 7;
    }
    public static void main(String[] args) {
        DiceGame game = new DiceGame();
        int numberOfGames = 1000; // 模拟1000次游戏
        int wins = 0;
        int losses = 0;

        for (int i = 0; i < numberOfGames; i++) {
            Die die1 = new Die();
            Die die2 = new Die();

            die1.roll();
            die2.roll();
            if (game.play()) {
                wins++;
            } else {
                losses++;
            }
        }

        System.out.println("You win " + wins + " times");
        System.out.println("You lose " + losses + " times");
    }
}
