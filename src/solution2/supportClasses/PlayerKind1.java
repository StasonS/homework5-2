package solution2.supportClasses;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import solution2.interfaces.Player;

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
    public String playSong() {
        return "Playing: " + songName;
    }

    public void show(Pane root, String name) {

        root.getChildren().clear();
        Text text = new Text(name);
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
