package solution2;

import solution2.supportClasses.PlayerKind2;

/**
 * Created by user on 20.08.17.
 */
public class Player4 extends PlayerKind2 {
    public Player4(double price) {
        super(price);
    }

    @Override
    public String playSong() {
        return "Playing: " + playlist[playlist.length - 1];
    }
}
