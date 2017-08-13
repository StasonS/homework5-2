package solution2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Created by user on 13.08.17.
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Players");
        primaryStage.setWidth(400);
        primaryStage.setHeight(400);

        Pane root = new Pane();


        root.getChildren().addAll();

        Player1_1 p = new Player1_1(35);
        p.songName = "Good Song";
        p.show(root);
//        new Player1_1(34).show(root);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
