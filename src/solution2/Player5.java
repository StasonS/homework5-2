package solution2;

import solution2.supportClasses.PlayerKind2;

/**
 * Created by user on 20.08.17.
 */
public class Player5 extends PlayerKind2 {

    public Player5(double price) {
        super(price);
    }

    @Override
    public String playAllSongs() {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < playlist.length; i++){
            sb.append("Playing: " + playlist[playlist.length - 1 - i] + "\n");
        }

        return sb.toString();
    }
}
