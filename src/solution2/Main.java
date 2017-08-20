package solution2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import solution2.supportClasses.BackgroundMaker;
import solution2.supportClasses.PlayerChoose;

/**
 * Created by user on 18.08.17.
 */
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Players");
        primaryStage.setWidth(400);
        primaryStage.setHeight(400);

        Pane root = new Pane();
        BackgroundMaker.setBG("#FFB266", root);

        PlayerChoose.startPlayers(root);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
