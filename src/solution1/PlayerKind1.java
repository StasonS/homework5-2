package solution1;

/**
 * Created by user on 13.08.17.
 */
public abstract class PlayerKind1 implements Player {
    final double price;
    public String songName;

    public PlayerKind1(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void playSong() {
        System.out.println("Playing: " + songName);
    }
}
