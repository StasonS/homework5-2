package solution2;

import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import solution1.Player2;

/**
 * Created by user on 13.08.17.
 */
public class Player6_6 extends Player2 implements Showable {

    public Player6_6(double price) {
        super(price);
    }

    @Override
    public void show(Pane root) {
        root.getChildren().clear();
        Text text = new Text("player1");
        text.setLayoutX(10);
        text.setLayoutY(25);

        root.getChildren().addAll(text);
    }
}
