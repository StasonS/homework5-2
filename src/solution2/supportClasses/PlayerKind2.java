package solution2.supportClasses;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import solution2.interfaces.Player;
import solution2.interfaces.Showable;

/**
 * Created by user on 13.08.17.
 */
public abstract class PlayerKind2 implements Player, Showable {
    final double price;
    public String[] playlist = new String[5];

    public PlayerKind2(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String playSong() {
        return "Playing: " + playlist[0];
    }

    public String playAllSongs(){
        StringBuilder sb = new StringBuilder("");
        for (String s : playlist){
            sb.append("Playing: " + s + "\n");
        }
        return sb.toString();
    }

    @Override
    public void show(Pane root, String name) {
        root.getChildren().clear();
        Text text = new Text(name);
        text.setLayoutX(10);
        text.setLayoutY(25);

        try{
            Button b = ButtonMaker.makeButton(this, root, 10, 50,
                    "How much?", this.getClass().getMethod("getPrice"));
            Button b1 = ButtonMaker.makeButton(this, root, 10, 85,
                    "Play a song", this.getClass().getMethod("playSong"));
            Button b2 = ButtonMaker.makeButton(this, root, 10, 120,
                    "Play all songs", this.getClass().getMethod("playAllSongs"));

            root.getChildren().addAll(text, b, b1, b2);

        }
        catch (Exception e){}

    }
}
