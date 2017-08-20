package solution2.supportClasses;

import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;

/**
 * Created by user on 20.08.17.
 */
public class BackgroundMaker {

    public static void setBG(String valueOfPaint, Pane root){

        double absRadius = 10;
        double relRadius = 0.05;
        CornerRadii radii = new CornerRadii(
                absRadius, relRadius, relRadius, absRadius,
                absRadius, relRadius, relRadius, absRadius,
                false, true, true, false, false, true, true, false
        );
        BackgroundFill fill = new BackgroundFill(Paint.valueOf(valueOfPaint), radii, new Insets(1));
        Background b = new Background(fill);
        root.setBackground(b);
    }
}
