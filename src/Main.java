/**
 * Created by user on 13.08.17.
 */
public class Main {

    public static void main(String[] args) {
//        Player p = new Player1(22);
//        p.getPrice();
//        p.playSong();
//        System.out.println();
//
//        Player p1 = new Player2(23);
//        p1.playSong();

        Player6 player = new Player6(23);
        player.playlist[0] = "sdfsf";
        player.playlist[1] = "AAAAA";
        player.playAllSongs();
        System.out.println();
        player.shuffle();
        player.playAllSongs();
        System.out.println();

        Player5 player5 = new Player5(44);
        player5.playlist[0] = "sdfsf";
        player5.playlist[1] = "AAAAA";
        player5.playAllSongs();
    }
}
