package solution1;

/**
 * Created by user on 13.08.17.
 */
public class Player5 extends PlayerKind2 {

    public Player5(double price) {
        super(price);
    }

    @Override
    public void playAllSongs() {
        for (int i = super.playlist.length; i > 0; i--){
            System.out.println("Playing: " + super.playlist[i - 1]);
        }
    }
}
