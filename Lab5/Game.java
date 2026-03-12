public class Game {
    private String players[];

    Game(String names[]) {
        this.players = names;
    }

    public String toString() {
        String result = "Players in the Game:\n";
        for (String name : players) {
            result += name + "\n";
        }
        return result;
    }
}