package solution2;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import solution1.*;

import java.util.concurrent.Callable;

/**
 * Created by user on 13.08.17.
 */
public class Player1_1 extends Player1 implements Showable{

    public Player1_1(double price) {
        super(price);
    }

    @Override
    public void playSong() {
//        super.playSong();
        returnSongName();
    }

    public String returnSongName(){
        return this.songName;
    }

    @Override
    public void show(Pane root) {

        root.getChildren().clear();
        Text text = new Text("Player1");
        text.setLayoutX(10);
        text.setLayoutY(25);

        try {
            Button b = ButtonMaker.makeButton(this, root, 10, 50,
                    "How much?", this.getClass().getMethod("getPrice"));
            Button b1 = ButtonMaker.makeButton(this, root, 10, 85,
                    "Play a song", this.getClass().getMethod("playSong"));

            root.getChildren().addAll(text, b, b1);

        } catch (Exception e){}


    }
}
