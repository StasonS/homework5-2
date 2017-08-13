package solution2;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import solution1.Player;

import java.lang.reflect.Method;

/**
 * Created by user on 13.08.17.
 */
public class ButtonMaker {

    public static Button makeButton(Player player, Pane root, double x, double y, String text, Method method){
        Button button = new Button(text);
        button.setLayoutX(x);
        button.setLayoutY(y);
        button.setOnAction(event -> {
            try {
                Text text1 = new Text("" + method.invoke(player));
                text1.setLayoutX(x + 100);
                text1.setLayoutY(y + 18);
                root.getChildren().addAll(text1);
            } catch (Exception e){}

        });

        return button;
    }
}
