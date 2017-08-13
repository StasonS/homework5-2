/**
 * Created by user on 13.08.17.
 */
public abstract class PlayerKind2 implements Player{
    final double price;
    public String[] playlist = new String[5];

    public PlayerKind2(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void playSong() {
        System.out.println("Playing: " + playlist[0]);
    }

    public void playAllSongs(){
        for (String s : playlist){
            System.out.println("Playing: " + s);
        }
    }
}
