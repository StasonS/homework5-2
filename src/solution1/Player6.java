package solution1;

import java.util.*;

/**
 * Created by user on 13.08.17.
 */
public class Player6 extends PlayerKind2{

    public Player6(double price) {
        super(price);
    }

    public void shuffle(){
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
    }
}
