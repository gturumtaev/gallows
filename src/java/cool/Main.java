package java.cool;

public class Main {
    public static void main(String[] args) {
        GameProcess game = new GameProcess(new Dictionary(new FileReader()), new Gallows());
        game.start();
    }
}