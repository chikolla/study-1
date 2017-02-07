package patterns.fundamentals.adapter;

/**
 * Created by nugusbayevkk on 2/6/17.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String filename) {
        System.out.println("VLC play on "+filename);
    }

    @Override
    public void playMp4(String filename) {

    }
}
