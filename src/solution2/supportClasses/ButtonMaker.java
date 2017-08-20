package solution2.supportClasses;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import solution2.interfaces.Player;
import solution2.interfaces.Showable;

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
                if (root.getChildren().get(root.getChildren().size() - 1) instanceof Text) {
                    root.getChildren().remove(root.getChildren().size() - 1);
                }
                Text text1 = new Text("" + method.invoke(player));
                text1.setLayoutX(x + 120);
                text1.setLayoutY(y + 18);
                root.getChildren().addAll(text1);
            } catch (Exception e){}

        });

        return button;
    }


    public static Button makeButton(Pane root, Showable showable, String name, double x, double y){
        Button button = new Button(name);
        button.setLayoutX(x);
        button.setLayoutY(y);

        button.setOnAction(event -> {
            root.getChildren().removeAll();
            showable.show(root, "Player1");
        });

        root.getChildren().addAll(button);


        return button;
    }
}
