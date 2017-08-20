package solution2.supportClasses;

import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import solution2.*;
import solution2.interfaces.Player;
import solution2.interfaces.Showable;

/**
 * Created by user on 20.08.17.
 */
public class PlayerChoose {

    public static void startPlayers(Pane root){
        Text t = new Text("HELLO!\nChoose a player you want:");
        t.setLayoutY(25);
        t.setLayoutX(10);

        root.getChildren().addAll(t);


        String[] playlist = new String[]{"Song1", "Song2", "Song3", "Song4", "Song5"};
        String song = "Song";

        Showable[] players = new Showable[]{new Player1(33), new Player2(44), new Player3(55),
                new Player4(66), new Player5(77), new Player6(88)};
        for (int i = 0; i < 2; i++){
            PlayerKind1 pk1 = (PlayerKind1) players[i];
            pk1.songName = song;
        }
        for (int i = 2; i < players.length; i++){
            PlayerKind2 pk2 = (PlayerKind2) players[i];
            for (int j = 0; j < pk2.playlist.length; j++){
                pk2.playlist[j] = playlist[j];
            }
        }

        double x = 10;
        double y = 55;

        for (Showable p : players){
            ButtonMaker.makeButton(root, p, p.getClass().getSimpleName(), x, y);
            y += 35;
        }

    }
}
