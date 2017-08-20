package solution2;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import solution2.supportClasses.ButtonMaker;
import solution2.supportClasses.PlayerKind2;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by user on 20.08.17.
 */
public class Player6 extends PlayerKind2 {

    public Player6(double price) {
        super(price);
    }

    public String shuffle(){
        ArrayList<String> list = new ArrayList<>();
        for (String s : this.playlist){
            list.add(s);
        }

        Collections.shuffle(list);

        int i = 0;
        for (String s : list){
            this.playlist[i] = s;
            i++;
        }

        return "Done!";
    }

    @Override
    public void show(Pane root, String name) {
        super.show(root, name);

        try{
            Button b = ButtonMaker.makeButton(this, root, 10, 155,
                    "Shuffle songs", this.getClass().getMethod("shuffle"));
            root.getChildren().addAll(b);
        }
        catch (Exception e){}
    }
}
