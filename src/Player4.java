/**
 * Created by user on 13.08.17.
 */
public class Player4 extends PlayerKind2 {

    public Player4(double price) {
        super(price);
    }

    @Override
    public void playSong() {
        System.out.println("Playing: " + super.playlist[playlist.length - 1]);
    }
}
